package de.fhrosenheim.gui.u01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


/**
 * Einfache Suchmaske mit Eingabefeld und Button (FXML).
 * 
 * @author dominik.haas
 */
public class SearchViewController implements Initializable {
    
    @FXML
    private void doSearch(ActionEvent event) {
        System.out.println("Do search!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
