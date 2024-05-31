ConfigurationManager - Singleton Design Pattern Example
This project demonstrates the Singleton Design Pattern using a ConfigurationManager class for managing system settings.

Overview
The Singleton Design Pattern ensures that a class has only one instance and provides a global point of access to that instance.

In this example, the ConfigurationManager class is used to manage system configuration settings such as the database URL, username, and password.

Installation
Clone the repository:
bash
Copy code
git clone https://github.com/your-username/configuration-manager.git
Open the project in your preferred Java IDE.
Usage
Import the ConfigurationManager class into your Java project.
Obtain the singleton instance using:
java
Copy code
ConfigurationManager configManager = ConfigurationManager.getInstance();
Initialize the ConfigurationManager with database credentials:
java
Copy code
configManager.initialize("jdbc:mysql://localhost:3306/mydatabase", "admin", "password123");
Access configuration values:
java
Copy code
String databaseUrl = configManager.getDatabaseUrl();
String username = configManager.getUsername();
String password = configManager.getPassword();
Error Handling
If the ConfigurationManager is initialized more than once, an IllegalStateException is thrown with an appropriate error message.
If the ConfigurationManager is accessed before initialization, an IllegalStateException is thrown with an appropriate error message.
If null or empty values are provided during initialization, an IllegalArgumentException is thrown with an appropriate error message.
Example
java
Copy code
public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        try {
            configManager.initialize("jdbc:mysql://localhost:3306/mydatabase", "admin", "password123");
            System.out.println("Database URL: " + configManager.getDatabaseUrl());
            System.out.println("Username: " + configManager.getUsername());
            System.out.println("Password: " + configManager.getPassword());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Error initializing ConfigurationManager: " + e.getMessage());
        }
    }
}