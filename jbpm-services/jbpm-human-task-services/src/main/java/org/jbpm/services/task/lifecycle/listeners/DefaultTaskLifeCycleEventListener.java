/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbpm.services.task.lifecycle.listeners;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;

import org.jbpm.services.task.events.AfterTaskActivatedEvent;
import org.jbpm.services.task.events.AfterTaskAddedEvent;
import org.jbpm.services.task.events.AfterTaskClaimedEvent;
import org.jbpm.services.task.events.AfterTaskCompletedEvent;
import org.jbpm.services.task.events.AfterTaskExitedEvent;
import org.jbpm.services.task.events.AfterTaskFailedEvent;
import org.jbpm.services.task.events.AfterTaskSkippedEvent;
import org.jbpm.services.task.events.AfterTaskStartedEvent;
import org.jbpm.services.task.events.AfterTaskStoppedEvent;
import org.kie.internal.task.api.model.Task;


/**
 *
 */

@ApplicationScoped
public class DefaultTaskLifeCycleEventListener implements TaskLifeCycleEventListener{

    public DefaultTaskLifeCycleEventListener() {
    }

    public void afterTaskStartedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskStartedEvent Task ti) {
        
    }

    public void afterTaskActivatedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskActivatedEvent Task ti) {
        
    }

    public void afterTaskClaimedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskClaimedEvent Task ti) {
        
    }

    public void afterTaskSkippedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskSkippedEvent Task ti) {
        
    }

    public void afterTaskStoppedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskStoppedEvent Task ti) {
        
    }

    public void afterTaskCompletedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskCompletedEvent Task ti) {
        
    }

    public void afterTaskFailedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskFailedEvent Task ti) {
        
    }

    public void afterTaskAddedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskAddedEvent Task ti) {
        
    }

    public void afterTaskExitedEvent(@Observes(notifyObserver= Reception.IF_EXISTS) @AfterTaskExitedEvent Task ti) {
        
    }
    
}
