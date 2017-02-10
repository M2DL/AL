package Agent.Percevoir.CreerPerception.Perceptions;

import Agent.Percevoir.CreerPerception.Perceptions.AbstractPerception;
import interfaceswcomp.OCService;

/**
 * Created by Kévin on 10/02/2017.
 */
public class PerceptionAnnonce extends AbstractPerception {
    private OCService service;
    private ReferenceAgent ref;
    public PerceptionAnnonce(Annonce message){
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