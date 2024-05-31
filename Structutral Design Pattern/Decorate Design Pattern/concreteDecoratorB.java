public class concreteDecoratorB extends decorator {
    public concreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorB operation.");
    }
}
