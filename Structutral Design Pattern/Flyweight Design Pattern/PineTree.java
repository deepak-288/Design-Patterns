// PineTree.java
public class PineTree implements Tree {
    private final String type;

    public PineTree() {
        this.type = "Pine Tree";
        System.out.println("Creating a new Pine Tree object");
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying " + type + " at (" + x + ", " + y + ")");
    }
}
