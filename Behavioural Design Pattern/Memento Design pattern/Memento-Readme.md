Memento Design Pattern Example
This Java project demonstrates the Memento Design Pattern, which allows capturing and storing an object's internal state so that it can be restored later.

Files
Originator.java: Defines the Originator class that has a state and can create and restore mementos.
Memento.java: Defines the Memento class that stores the state of the Originator.
Caretaker.java: Defines the Caretaker class that holds onto mementos but has no knowledge of their content.
MementoPatternExample.java: Contains the main method to demonstrate the pattern.
Usage
Compile the Java files using javac *.java.
Run the MementoPatternExample class to see the pattern in action.
How it Works
Originator is the object whose state needs to be saved and restored.
Memento is the object that stores the state of the Originator.
Caretaker holds onto the Memento objects but has no knowledge of their content.
Error Handling
The example includes error handling for trying to access an invalid memento index, ensuring a foolproof design.