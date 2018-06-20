package de.fhrosenheim.gui.customer.search.api;

import java.util.List;

/**
 * Interface für eine Kundensuche
 * 
 * @author dominik.haas
 */
public interface CustomerSearch {
    List<CustomerDto> search(String text);
}
