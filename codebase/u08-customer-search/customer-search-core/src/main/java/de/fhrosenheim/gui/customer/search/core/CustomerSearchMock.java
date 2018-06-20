package de.fhrosenheim.gui.customer.search.core;

import de.fhrosenheim.gui.customer.search.api.CustomerDto;
import de.fhrosenheim.gui.customer.search.api.CustomerSearch;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Einfache Mock-Implementierung für die Kundensuche
 * 
 * @author dominik.haas
 */
public class CustomerSearchMock implements CustomerSearch {

    
    private static final List<CustomerDto> ALL_CUSTOMERS = Arrays.asList(
                new CustomerDto("1", "Dominik", "Haas"),
                new CustomerDto("2", "John", "Doe"),
                new CustomerDto("3", "Max", "Mustermann"));
    
    @Override
    public List<CustomerDto> search(String text) {
        
        // Filter ALL_CUSTOMERS with Java8 Streams API
        return ALL_CUSTOMERS.stream()
                     .filter(dto -> dto.getLastName().contains(text))
                     .collect(Collectors.toList());
    }
    
}
