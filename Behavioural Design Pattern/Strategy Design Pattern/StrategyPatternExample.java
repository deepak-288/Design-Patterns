public class StrategyPatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        // Try to execute without setting a strategy
        try {
            context.executeStrategy();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Set and execute ConcreteStrategy1
        context.setStrategy(new ConcreteStrategy1());
        context.executeStrategy();

        // Set and execute ConcreteStrategy2
        context.setStrategy(new ConcreteStrategy2());
        context.executeStrategy();
    }
}
