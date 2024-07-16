package java_design_patterns.strategyPattern;

public class StrategyApplication {

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println(context.executeStrategy(4,7));

        context = new Context(new SubOperation());
        System.out.println(context.executeStrategy(2,5));

        context = new Context(new MultiplyOperation());
        System.out.println(context.executeStrategy(4,9));
    }
}
