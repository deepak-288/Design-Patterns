public class MementoPatternExample {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Set initial state
        originator.setState("State1");
        caretaker.addMemento(originator.save());

        // Change state
        originator.setState("State2");
        caretaker.addMemento(originator.save());

        // Restore to previous state
        originator.restore(caretaker.getMemento(0));
        System.out.println("Current state: " + originator.getState());

        // Try to get an invalid memento index
        try {
            Memento invalidMemento = caretaker.getMemento(2);
            System.out.println("Restored state: " + invalidMemento.getState());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
