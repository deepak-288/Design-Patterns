Bridge Design Pattern Example
This Java project demonstrates the Bridge Design Pattern, which is used to separate abstraction from implementation so that both can vary independently.

Project Structure
The project is structured as follows:

Shape.java: Interface defining the Shape behavior.
Circle.java: Concrete implementation of the Shape interface for drawing a Circle.
Square.java: Concrete implementation of the Shape interface for drawing a Square.
Color.java: Interface defining the Color behavior.
RedColor.java: Concrete implementation of the Color interface for applying Red color.
GreenColor.java: Concrete implementation of the Color interface for applying Green color.
ShapeColor.java: Abstract class representing the bridge between Shape and Color.
CircleRedColor.java: Refined abstraction class combining Circle and Red color.
SquareGreenColor.java: Refined abstraction class combining Square and Green color.
BridgeExample.java: Main class demonstrating the usage of the Bridge pattern.
Running the Example
To run the example, execute the BridgeExample.java file. It creates instances of shapes (Circle, Square) and colors (Red, Green), then combines them using the Bridge pattern to draw shapes with different colors.

Ensure that you have Java installed on your system and configured properly to run Java applications.

Error Handling
The example includes error handling for cases where null values are passed to the bridge classes. This demonstrates how the Bridge pattern can handle such scenarios gracefully.