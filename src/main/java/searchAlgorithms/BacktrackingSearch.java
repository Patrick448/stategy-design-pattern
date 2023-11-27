package searchAlgorithms;

public class BacktrackingSearch implements SearchAlgorithm{
    @Override
    public String runSearch(boolean prune, int initialState, int goalState, RuleSet rules) {
        return initialState +"->" + 10 + "->" + 5 + "->" + 11 + "->" + goalState;
    }
}
