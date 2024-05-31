public class State2 implements State {
    public void doAction(Context context) {
        System.out.println("State 2 action");
        context.setState(this);
    }

    public String toString() {
        return "State 2";
    }
}
