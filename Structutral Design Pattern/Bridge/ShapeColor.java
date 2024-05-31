// ShapeColor.java
public abstract class ShapeColor {
    protected Shape shape;
    protected Color color;

    public ShapeColor(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public abstract void draw();
}
