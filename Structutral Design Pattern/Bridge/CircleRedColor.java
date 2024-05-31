// CircleRedColor.java
public class CircleRedColor extends ShapeColor {
    public CircleRedColor(Shape shape, Color color) {
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
