package java_design_patterns.strategyPattern;

public class Context {
    private final Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.doOperation(a,b);
    }
}
