package de.fhrosenheim.gui.u01;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Einfache Suchmaske mit Eingabefeld und Button.
 * 
 * @author dominik.haas
 */
public class SearchView extends HBox {

    public SearchView() {
        final Button button = new Button("Search");
        button.addEventHandler(ActionEvent.ACTION, (e) -> {
            System.out.println("Search");
        });
        getChildren().addAll(new TextField(), button);
    }

    @Override
    public final ObservableList<Node> getChildren() {
        return super.getChildren(); //To change body of generated methods, choose Tools | Templates.
    }
}
