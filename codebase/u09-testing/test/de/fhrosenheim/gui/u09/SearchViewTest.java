package de.fhrosenheim.gui.u09;

import java.util.Arrays;
import java.util.List;
import javafx.scene.Parent;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.loadui.testfx.GuiTest;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SearchViewTest extends GuiTest {

    @Mock
    private ISearchService searchService;
    @Mock
    private ISearchResultSink searchResultSink;

    private SearchViewPageObject pageObject;

    @Before
    public void setUp() {
        pageObject = new SearchViewPageObject(this);
    }

    @Override
    protected Parent getRootNode() {
        return new SearchView(searchService, searchResultSink);
    }

    @Test
    public void testSearchKatze() {
        // initialisiere test mock und gebe dummy ergebnisse zurueck
        List<String> results = Arrays.asList("katze1.jpg", "katze2.jpg");
        when(searchService.search("katze")).thenReturn(results);
        
        // interagiere mit UI, fuelle Textfeld und clicke button
        pageObject.search("katze");

        // pruefe ob ergbnisse angekommen sind
        verify(searchResultSink, times(1)).process(results);
    }
}
