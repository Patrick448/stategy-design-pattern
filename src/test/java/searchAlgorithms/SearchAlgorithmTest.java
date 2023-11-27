package searchAlgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchAlgorithmTest {

    @Test
    void shouldReturnBacktrackingSearch() {
        SearchAlgorithm searchAlgorithm = new BacktrackingSearch();
        assertEquals("0->10->5->11->20", searchAlgorithm.runSearch(false, 0, 20, new RuleSet()));
    }

    @Test
    void shouldReturnDepthFirstSearch() {
        SearchAlgorithm searchAlgorithm = new DepthFirstSearch();
        assertEquals("0->6->7->20", searchAlgorithm.runSearch(false, 0, 20, new RuleSet()));
    }

    @Test
    void shouldReturnOrderedSearch() {
        SearchAlgorithm searchAlgorithm = new OrderedSearch();
        assertEquals("0->10->20->30->40", searchAlgorithm.runSearch(false, 0, 40, new RuleSet()));
    }

    @Test
    void shouldReturnBreadthFirstSearch() {
        SearchAlgorithm searchAlgorithm = new BreadthFirstSearch();
        assertEquals("0->2->3->4->10", searchAlgorithm.runSearch(false, 0, 10, new RuleSet()));
    }

}