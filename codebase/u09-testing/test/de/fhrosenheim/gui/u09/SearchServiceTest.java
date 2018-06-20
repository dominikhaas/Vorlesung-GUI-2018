package de.fhrosenheim.gui.u09;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SearchServiceTest {

    private ISearchService searchService;

    private final String input;
    private final List<String> expected;

    @Parameters
    public static Iterable<Object[]> testdata() {
        return Arrays.asList(new Object[][]{
            {"katze", new String[]{"katze1.jpg", "katze2.jpg"}},
            {"hund", new String[]{"hund1.jpg", "hund2.jpg"}},
            {"vogel", new String[]{}}
        });
    }

    public SearchServiceTest(String input, String[] expected) {
        this.input = input;
        this.expected = Arrays.asList(expected);
    }

    @Before
    public void setup() {
        searchService = new SearchService();
    }

    @Test
    public void testSearch() {
        List<String> results = searchService.search(input);
        assertThat(results, hasSize(expected.size()));
        assertThat(results, is(equalTo(expected)));
    }

}
