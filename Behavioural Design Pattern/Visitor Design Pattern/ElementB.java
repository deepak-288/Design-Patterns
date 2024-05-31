public class ElementB implements Element {
    private int value;

    public ElementB(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be greater than zero");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor == null) {
            throw new IllegalArgumentException("Visitor cannot be null");
        }
        visitor.visit(this);
    }
}
