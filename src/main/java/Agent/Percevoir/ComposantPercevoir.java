package Agent.Percevoir;

import Agent.Percevoir.CreerPerception.FabriqueAbstractPerception;
import Agent.Percevoir.CreerPerception.ICreerPerception;
import Agent.Percevoir.CreerPerception.Perceptions.AbstractPerception;
import Agent.Percevoir.LireMessageInfrastructure.ILireMessageInfrastructure;
import Agent.Percevoir.LireMessageInfrastructure.LireMessageInfrastructure;
import Agent.Percevoir.LireMessageSonde.ILireMessageSonde;
import Agent.Percevoir.LireMessageSonde.LireMessageSonde;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kévin on 10/02/2017.
 */
public class ComposantPercevoir implements IComposantPercevoir{

    private ILireMessageInfrastructure lireMessageInfrastructure;
    private ILireMessageSonde lireMessageSonde;
    private ReferenceAgent referenceAgent;
    private ICommunication communication;

    public ComposantPercevoir(ReferenceAgent referenceAgent){
        lireMessageInfrastructure = new LireMessageInfrastructure();
        lireMessageInfrastructure.setCommunication(communication);
        lireMessageSonde = new LireMessageSonde();
        this.referenceAgent = referenceAgent;
    }
    @Override
    public List<AbstractPerception> percevoir() {
        List<AbstractPerception> perceptions = new ArrayList<AbstractPerception>();
        perceptions.add(lireMessageSonde.lireSonde(referenceAgent));
        perceptions.add(lireMessageInfrastructure.lireInfrastructure(referenceAgent));

        return perceptions;
    }

    public ICommunication getCommunication() {
        return communication;
    }

    public void setCommunication(ICommunication communication) {
        this.communication = communication;
    }
}
