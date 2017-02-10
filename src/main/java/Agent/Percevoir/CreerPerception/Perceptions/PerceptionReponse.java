package Agent.Percevoir.CreerPerception.Perceptions;

import Agent.Percevoir.CreerPerception.Perceptions.AbstractPerception;
import interfaceswcomp.OCService;

/**
 * Created by Kévin on 10/02/2017.
 */
public class PerceptionReponse extends AbstractPerception {
    private OCService service;
    private ReferenceAgent ref;
    public PerceptionReponse(Reponse message){
        this.service = message.getService();
        this.ref = message.getReferenceAgent();
    }

    public OCService getService(){
        return service;
    }

    public ReferenceAgent getReferenceAgent(){
        return ref;
    }
}