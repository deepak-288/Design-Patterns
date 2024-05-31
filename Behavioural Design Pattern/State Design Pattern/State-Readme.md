State Design Pattern Example
This Java project demonstrates the State Design Pattern, which allows an object to alter its behavior when its internal state changes. The pattern encapsulates state-specific behavior into separate classes and allows the object to change its state at runtime.

Files
State.java: Defines the State interface with a method to perform an action based on the state.
State1.java: Implements the State interface for the first concrete state.
State2.java: Implements the State interface for the second concrete state.
Context.java: Defines the Context class that maintains the current state and allows setting a new state.
StatePatternExample.java: Contains the main method to demonstrate the pattern.
Usage
Compile the Java files using javac *.java.
Run the StatePatternExample class to see the pattern in action.
How it Works
State interface defines a method to perform an action based on the state.
State1 and State2 are concrete implementations of the State interface with state-specific actions.
Context class maintains the current state and allows setting a new state.
The StatePatternExample demonstrates creating a context, setting states, performing actions based on the current state, and handling errors when trying to set a null state.
Error Handling
The example includes error handling when trying to set a null state, ensuring a foolproof design.

