public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public void executeStrategy() {
        if (strategy == null) {
            throw new IllegalStateException("No strategy set");
        }
        strategy.executeStrategy();
    }
}
