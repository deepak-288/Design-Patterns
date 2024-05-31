Command Design Pattern Example
This Java project demonstrates the Command Design Pattern in a simple home automation system where you can control a light using a remote control.

Files
Light.java: Contains the Light class representing the receiver.
Command.java: Defines the Command interface.
TurnOnCommand.java: Implements the Command interface for turning the light on.
TurnOffCommand.java: Implements the Command interface for turning the light off.
RemoteControl.java: Implements the invoker and manages commands.
CommandPatternExample.java: Contains the main method to demonstrate the pattern.
Usage
Compile the Java files using javac *.java.
Run the CommandPatternExample class to see the pattern in action.
How it Works
Light class represents the receiver with methods to turn the light on and off.
Command interface defines the execute method that concrete commands implement.
TurnOnCommand and TurnOffCommand are concrete command classes that encapsulate the actions of turning the light on and off.
RemoteControl acts as the invoker and manages commands.
In CommandPatternExample, we create instances of the light, commands, and remote control, set the commands in the remote control, and simulate pressing the buttons to execute commands.
Error Handling
The RemoteControl class handles the case of pressing an unknown button gracefully by displaying a "Command not found" message.