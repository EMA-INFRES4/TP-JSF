/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cours;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.jboss.logging.Logger;

/**
 *
 * @author vjo
 */
public class JsfPhaseTracker implements PhaseListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5324739851169656488L;
	private static final Logger logger = Logger.getLogger(JsfPhaseTracker.class.getCanonicalName());


    @Override
    public void beforePhase(PhaseEvent event) {
        logger.infov("beforePhase: {0}", event.getPhaseId());
    }


    @Override
    public void afterPhase(PhaseEvent event) {
        logger.infov("afterPhase: {0}", event.getPhaseId());
        PhaseId phaseId = event.getFacesContext().getCurrentPhaseId();

        if (phaseId.equals(PhaseId.RESTORE_VIEW)) {
        	// traitement specifique pour une phase, par exemple Restore view
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}