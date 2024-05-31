// OakTree.java
public class OakTree implements Tree {
    private final String type;

    public OakTree() {
        this.type = "Oak Tree";
        System.out.println("Creating a new Oak Tree object");
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying " + type + " at (" + x + ", " + y + ")");
    }
}
