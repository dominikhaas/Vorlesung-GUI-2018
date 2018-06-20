package de.fhrosenheim.gui.u09;

import java.util.List;

/**
 * Verarbeitet Suchergebnisse.
 */
public interface ISearchResultSink {

    /**
     * Verarbeitet die übergebenen Suchergebnisse.
     *
     * @param results die Suchergebnisse.
     */
    void process(List<String> results);
}
