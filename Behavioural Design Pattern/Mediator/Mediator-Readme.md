Mediator Design Pattern Example
This Java project demonstrates the Mediator Design Pattern, which defines an object that encapsulates how a set of objects interact with each other. It promotes loose coupling by keeping objects from referring to each other explicitly.

Files
Mediator.java: Defines the Mediator interface with a method to send messages between users.
ChatMediator.java: Implements the Mediator interface to create a concrete mediator for managing communication.
User.java: Defines the User interface with methods for sending and receiving messages.
ChatUser.java: Implements the User interface for concrete users of the chat system.
MediatorPatternExample.java: Contains the main method to demonstrate the pattern.
Usage
Compile the Java files using javac *.java.
Run the MediatorPatternExample class to see the pattern in action.
How it Works
Mediator interface defines a method to send messages between users.
ChatMediator implements Mediator to manage communication between users.
User interface defines methods for users to send and receive messages.
ChatUser implements User to interact with the mediator for message communication.
Error Handling
The example includes error handling when trying to send a message without adding the user to the mediator, ensuring a foolproof design.