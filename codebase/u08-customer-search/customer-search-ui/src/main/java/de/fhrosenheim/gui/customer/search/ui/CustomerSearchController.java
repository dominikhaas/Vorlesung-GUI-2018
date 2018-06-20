package de.fhrosenheim.gui.customer.search.ui;

import de.fhrosenheim.gui.common.Registry;
import de.fhrosenheim.gui.customer.search.api.CustomerDto;
import de.fhrosenheim.gui.customer.search.api.CustomerSearch;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * Controller für den Kundensuchdialog
 *
 * @author dominik.haas
 */
public class CustomerSearchController implements Initializable {
    
    @FXML
    private TextField searchInput;
    @FXML
    private Button searchButton;
    @FXML
    private ListView<CustomerDto> resultList;
    
    private final CustomerSearch customerSearch = Registry.getService(CustomerSearch.class);
    private final CustomerSearchModel customerSearchModel = new CustomerSearchModel();
            

    /**
     * Initializes the controller class by adding event handler and binding properties.
     * @param url See Initializable
     * @param rb See Initializable
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        searchButton.addEventHandler(ActionEvent.ACTION, this::searchCustomers);
        searchInput.textProperty().bindBidirectional(customerSearchModel.searchTextProperty());
        resultList.itemsProperty().bind(customerSearchModel.resultsProperty());
    }  
    
    public void searchCustomers(ActionEvent e) {
        List<CustomerDto> result = customerSearch.search(customerSearchModel.getSearchText());
        customerSearchModel.setResult(result);
    }
}
