package searchAlgorithms;

public class OrderedSearch implements SearchAlgorithm{
    @Override
    public String runSearch(boolean prune, int initialState, int goalState, RuleSet rules) {
        return initialState +"->" + 10 + "->" + 20 + "->" + 30 +  "->" + goalState;
    }
}
