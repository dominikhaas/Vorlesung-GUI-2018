package de.fhrosenheim.gui.u09;

import java.util.List;

public class ConsoleSearchResultSink implements ISearchResultSink {

    @Override
    public void process(List<String> results) {
        if (results.isEmpty()) {
            System.out.println("Keine Suchergebnisse :(");
        } else {
            results.forEach(System.out::println);
        }
    }
}
