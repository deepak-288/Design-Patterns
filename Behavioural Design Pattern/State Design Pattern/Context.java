public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
