package de.fhrosenheim.gui.u09;

import java.util.List;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Einfache Suchmaske mit Eingabefeld und Button.
 * 
 * @author dominik.haas
 */
public class SearchView extends HBox {

    public SearchView(ISearchService searchService, ISearchResultSink searchResultSink) {
        final Button button = new Button("Search");
        button.setId("search");
        button.setDisable(true);
        button.setDefaultButton(true);
        
        TextField textField = new TextField();
        textField.setId("query");
        
        // Der Button ist deaktiviert, wenn das Suchfeld leer ist
        textField.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            button.setDisable(newValue.isEmpty());
        });

        // Beim Klick auf den Button wird nach einem Suchbegriff gesucht
        button.addEventHandler(ActionEvent.ACTION, e -> {
            List<String> results = searchService.search(textField.getText());
            searchResultSink.process(results);
        });
        
        getChildren().addAll(textField, button);
    }
}
