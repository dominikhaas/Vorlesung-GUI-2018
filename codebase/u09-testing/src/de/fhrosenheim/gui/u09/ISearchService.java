package de.fhrosenheim.gui.u09;

import java.util.List;

/**
 * Sucht nach einem bestimmten Suchbegriff.
 */
public interface ISearchService {

    /**
     * Sucht nach einem bestimmten Begriff.
     *
     * @param query der Begriff, nach dem gesucht werden soll.
     * @return die Suchergebnisse für den Begriff.
     */
    List<String> search(String query);
}
