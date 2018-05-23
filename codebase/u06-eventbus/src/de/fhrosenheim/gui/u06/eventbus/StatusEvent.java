package de.fhrosenheim.gui.u06.eventbus;

import java.util.EventObject;

/**
 * Event um Statusmeldungen zu transportieren
 * 
 * @author dominik.haas
 */
public class StatusEvent extends EventObject {
    
    private final String status;

    public StatusEvent(Object source, String status) {
        super(source);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
}
