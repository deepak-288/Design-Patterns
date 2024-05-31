import java.util.ArrayList;
import java.util.List;

// Composite class
public class composite implements Component {
    private final List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite operation:");
        for (Component component : children) {
            component.operation();
        }
    }
}
