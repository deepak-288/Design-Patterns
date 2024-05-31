public abstract class AbstractClass {
    // Template method
    public void templateMethod() {
        commonMethod();
        specificMethod();
        hookMethod(); // Optional hook method
    }

    // Common method implemented in the abstract class
    private void commonMethod() {
        System.out.println("This is a common method.");
    }

    // Abstract method to be implemented by subclasses
    protected abstract void specificMethod();

    // Optional hook method with default implementation
    protected void hookMethod() {
        // Default implementation does nothing
    }
}
