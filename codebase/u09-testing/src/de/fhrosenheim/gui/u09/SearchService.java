package de.fhrosenheim.gui.u09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchService implements ISearchService {
    @Override
    public List<String> search(String query) {
        switch(query) {
            case "katze":
                return Arrays.asList("katze1.jpg", "katze2.jpg");
            case "hund":
                return Arrays.asList("hund1.jpg", "hund2.jpg");
            default:
                return Collections.emptyList();
        }
    }   
}
