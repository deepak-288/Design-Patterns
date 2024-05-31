// SquareGreenColor.java
public class SquareGreenColor extends ShapeColor {
    public SquareGreenColor(Shape shape, Color color) {
        super(shape, color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing ");
        shape.draw();
        System.out.print(" with ");
        color.applyColor();
    }
}
