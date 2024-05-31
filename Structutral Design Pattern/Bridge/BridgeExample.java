// BridgeExample.java
public class BridgeExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Color red = new RedColor();
        ShapeColor circleRed = new CircleRedColor(circle, red);
        circleRed.draw();

        Shape square = new Square();
        Color green = new GreenColor();
        ShapeColor squareGreen = new SquareGreenColor(square, green);
        squareGreen.draw();

        // Error handling with null shape
        Shape nullShape = null;
        Color nullColor = new RedColor();  // Using red color for demonstration
        ShapeColor invalidShapeColor = new CircleRedColor(nullShape, nullColor);
        invalidShapeColor.draw();
    }
}
