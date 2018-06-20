package de.fhrosenheim.gui.customer.search.ui;

import de.fhrosenheim.gui.customer.search.api.CustomerDto;
import java.util.List;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Model für die Kundensuche
 * 
 * @author dominik.haas
 */
public class CustomerSearchModel {
    
    private final StringProperty searchText = new SimpleStringProperty();
    private final ObjectProperty<ObservableList<CustomerDto>> result = new SimpleObjectProperty<>();
           
    public StringProperty searchTextProperty() {
        return searchText;
    }
    
    public String getSearchText() {
        return searchText.get();
    }

    public ObjectProperty<ObservableList<CustomerDto>> resultsProperty() {
        return result;
    }

    public void setResult(List<CustomerDto> result) {
        this.result.set(FXCollections.observableArrayList(result));
    }
    
}
