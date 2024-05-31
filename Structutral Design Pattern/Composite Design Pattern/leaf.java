// Leaf class
public class leaf implements Component {
    private final String name;

    public leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + " operation.");
    }
}
