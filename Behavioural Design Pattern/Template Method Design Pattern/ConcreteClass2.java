public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void specificMethod() {
        System.out.println("This is specific method for ConcreteClass2.");
    }

    @Override
    protected void hookMethod() {
        System.out.println("Optional hook method overridden in ConcreteClass2.");
    }
}
