public class State1 implements State {
    public void doAction(Context context) {
        System.out.println("State 1 action");
        context.setState(this);
    }

    public String toString() {
        return "State 1";
    }
}
