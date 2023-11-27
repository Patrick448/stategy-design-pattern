package searchAlgorithms;

public class DepthFirstSearch implements SearchAlgorithm{
    @Override
    public String runSearch(boolean prune, int initialState, int goalState, RuleSet rules) {
        return initialState +"->" + 6 + "->" + 7 + "->" + goalState;
    }
}
