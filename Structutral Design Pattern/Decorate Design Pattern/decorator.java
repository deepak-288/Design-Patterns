public abstract class decorator implements Component {
    protected Component component;

    public decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
