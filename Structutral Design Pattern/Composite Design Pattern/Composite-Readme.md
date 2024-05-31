Composite Design Pattern Example
Overview
This example demonstrates the Composite Design Pattern, which is a structural pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. In this example, we have components (Component interface), leaf elements (Leaf class), and composite elements (Composite class) that form a hierarchical structure.

Files
Component.java: Defines the Component interface, which declares the operation method that all components must implement.

Leaf.java: Represents the leaf elements that do not have any children. Implements the Component interface and provides the specific operation for leaf components.

Composite.java: Represents the composite elements that can contain other components, including both leaf elements and other composite elements. Implements the Component interface and provides methods to add and remove child components.

CompositeExample.java: Main class that demonstrates the usage of the Composite Design Pattern. It creates a hierarchical structure of components, including leaf and composite elements, and performs operations on the composite structure.

How to Run
To run the Composite Design Pattern example:

Compile all Java files (Component.java, Leaf.java, Composite.java, CompositeExample.java).

Run the CompositeExample class, which serves as the entry point for executing the composite design pattern example.

Example Output
Upon running the CompositeExample class, you should see the following output:


Composite operation:
Leaf Leaf 1 operation.
Leaf Leaf 2 operation.
Composite operation:
Leaf Leaf 3 operation.
Leaf Leaf 4 operation.
This output demonstrates the hierarchical structure of components where composite elements can contain other components, including both leaf elements and other composite elements