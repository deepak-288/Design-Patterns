// Component interface
interface Component {
    void operation();
}

// ConcreteComponent class
class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation.");
    }
}

// Decorator class
abstract class Decorator implements Component {
    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

// ConcreteDecoratorA class
class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorA operation.");
    }
}

// ConcreteDecoratorB class
class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorB operation.");
    }
}

// DecoratorExample class
public class decoratorExample {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        Component decoratedComponentA = new ConcreteDecoratorA(new ConcreteComponent());
        decoratedComponentA.operation();

        Component decoratedComponentB = new ConcreteDecoratorB(new ConcreteComponent());
        decoratedComponentB.operation();
    }
}
