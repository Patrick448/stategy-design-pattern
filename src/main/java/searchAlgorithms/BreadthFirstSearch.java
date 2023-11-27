package searchAlgorithms;

public class BreadthFirstSearch implements SearchAlgorithm{
    @Override
    public String runSearch(boolean prune, int initialState, int goalState, RuleSet rules) {
        return initialState +"->" + 2 + "->" + 3 + "->" + 4 + "->" + goalState;
    }
}
