public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        State state1 = new State1();
        state1.doAction(context);

        State state2 = new State2();
        state2.doAction(context);

        // Try to set a null state
        try {
            context.setState(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
