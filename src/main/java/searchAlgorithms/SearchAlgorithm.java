package searchAlgorithms;

public interface SearchAlgorithm {

    String runSearch(boolean prune, int initialState, int goalState, RuleSet rules);
}
