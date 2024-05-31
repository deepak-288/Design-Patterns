Facade Design Pattern Example
Overview
This project demonstrates the Facade Design Pattern, a structural design pattern that provides a simplified interface to a complex system of classes.

Files
Main.java: Contains the main method to run the example and test the Facade pattern.
Engine.java: Represents the Engine subsystem.
FuelInjector.java: Represents the Fuel Injector subsystem.
Starter.java: Represents the Starter subsystem.
IgnitionFacade.java: Implements the Facade for the subsystems.
How to Run
Compile all Java files in the project.
Run the Main class to see the Facade Design Pattern in action.
Explanation
The Facade Design Pattern is used to hide the complexities of multiple subsystems (Engine, FuelInjector, Starter) behind a simplified interface (IgnitionFacade). This allows clients to interact with the subsystems through a single entry point, making the overall system easier to use and understand