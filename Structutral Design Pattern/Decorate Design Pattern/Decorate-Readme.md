Decorator Design Pattern Example
Overview
This example demonstrates the use of the Decorator Design Pattern. The Decorator pattern allows behavior to be added to individual objects dynamically, at runtime, without affecting the behavior of other objects from the same class.

Files
Component.java: Defines the interface for objects that can have responsibilities added to them dynamically.
ConcreteComponent.java: Implements the Component interface and defines an object to which additional responsibilities can be attached.
Decorator.java: Abstract class that implements the Component interface and acts as the base class for concrete decorators.
ConcreteDecoratorA.java: Extends the Decorator class and adds additional responsibilities to objects.
ConcreteDecoratorB.java: Another concrete decorator that adds different responsibilities to objects.
DecoratorExample.java: Contains the main method to demonstrate the Decorator Design Pattern.
How to Run
Compile all Java files in the terminal or command prompt:
bash
Copy code
javac Component.java ConcreteComponent.java Decorator.java ConcreteDecoratorA.java ConcreteDecoratorB.java DecoratorExample.java
Run the DecoratorExample class:
bash
Copy code
java DecoratorExample
Example Output
The example output will demonstrate how decorators can add functionality to objects dynamically.

Error Handling
The example includes basic error handling for compatibility issues between decorators and components. Ensure that decorators and components are used correctly to avoid runtime errors.