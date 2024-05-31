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

        // Attempting to initialize again (should throw IllegalStateException)
        try {
            configManager.initialize("jdbc:mysql://localhost:3306/anotherdatabase", "user", "pass");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Error initializing ConfigurationManager again: " + e.getMessage());
        }

        // Accessing configuration without initialization (should throw IllegalStateException)
        try {
            System.out.println("Database URL: " + configManager.getDatabaseUrl());
        } catch (IllegalStateException e) {
            System.err.println("Error accessing ConfigurationManager: " + e.getMessage());
        }
    }
}
