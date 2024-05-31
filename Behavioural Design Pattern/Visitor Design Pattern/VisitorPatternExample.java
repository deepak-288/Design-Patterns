import java.util.ArrayList;
import java.util.List;

public class VisitorPatternExample {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new ElementA("Element A1"));
        elements.add(new ElementB(10));
        elements.add(new ElementA("Element A2"));
        elements.add(new ElementB(20));

        ConcreteVisitor visitor = new ConcreteVisitor();

        for (Element element : elements) {
            try {
                element.accept(visitor);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Error case demonstration
        try {
            ElementA errorElement = new ElementA("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            ElementB errorElement = new ElementB(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            elements.get(0).accept(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
