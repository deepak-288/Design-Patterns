public class compositeExample {
    public static void main(String[] args) {
        // Create leaf components
        Component leaf1 = new leaf("Leaf 1");
        Component leaf2 = new leaf("Leaf 2");

        // Create composite components
        composite composite1 = new composite();
        composite1.add(leaf1);
        composite1.add(leaf2);

        Component leaf3 = new leaf("Leaf 3");
        Component leaf4 = new leaf("Leaf 4");

        composite composite2 = new composite();
        composite2.add(leaf3);
        composite2.add(leaf4);

        composite composite = new composite();
        composite.add(composite1);
        composite.add(composite2);

        // Perform operations
        composite.operation();
    }
}
