package de.fhrosenheim.gui.u06.status;

import de.fhrosenheim.gui.u06.eventbus.IEventBus;
import de.fhrosenheim.gui.u06.eventbus.SimpleEventBus;
import de.fhrosenheim.gui.u06.eventbus.StatusEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * Controller für die Statuskomponente - Empfänger von Statusevents
 *
 * @author dominik.haas
 */
public class StatusController implements Initializable {
    
    private final IEventBus bus = SimpleEventBus.getBus();
    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        bus.subscribe(StatusEvent.class, (StatusEvent event) -> {
            label.setText(event.getStatus());
        });
    }       
}
