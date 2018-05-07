package de.fhrosenheim.gui.u09;

import java.util.Arrays;
import javafx.scene.Parent;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.loadui.testfx.GuiTest;
import org.mockito.Mock;
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
}
