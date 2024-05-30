

# Magic Potion Shop

Welcome to the Magic Potion Shop! This repository demonstrates the usage of the Factory Design Pattern in a creative and foolproof way. The system handles different types of potions that a wizard can use, each with specific effects.

## Introduction

This example showcases a Magic Potion Shop where you can create and drink various types of potions using the Factory Design Pattern. The system includes comprehensive error handling to manage unknown potion types gracefully.

## Design Pattern

The Factory Design Pattern is used to create objects without specifying the exact class of the object that will be created. This pattern is particularly useful when the exact types and dependencies of the objects are not known until runtime.

## Components

### Potion (Abstract Product)

Defines the common interface for all potions.

```java
// Abstract Product
public abstract class Potion {
    public abstract void drink();
}
```

### HealingPotion, InvisibilityPotion, StrengthPotion (Concrete Products)

Implement the `Potion` interface with specific behaviors.

```java
// Concrete Product: HealingPotion
public class HealingPotion extends Potion {
    @Override
    public void drink() {
        System.out.println("You feel your wounds healing!");
    }
}

// Concrete Product: InvisibilityPotion
public class InvisibilityPotion extends Potion {
    @Override
    public void drink() {
        System.out.println("You become invisible!");
    }
}

// Concrete Product: StrengthPotion
public class StrengthPotion extends Potion {
    @Override
    public void drink() {
        System.out.println("You feel incredibly strong!");
    }
}
```

### PotionFactory (Factory)

Contains the logic to create specific types of potions based on a given type.

```java
// Factory
public class PotionFactory {
    public Potion createPotion(String type) throws IllegalArgumentException {
        switch (type.toLowerCase()) {
            case "healing":
                return new HealingPotion();
            case "invisibility":
                return new InvisibilityPotion();
            case "strength":
                return new StrengthPotion();
            default:
                throw new IllegalArgumentException("Unknown potion type: " + type);
        }
    }
}
```

### Main (Client Code)

Demonstrates the usage of the factory to create and use different potions. Includes error handling for unknown potion types.

```java
public class Main {
    public static void main(String[] args) {
        PotionFactory factory = new PotionFactory();

        try {
            Potion healingPotion = factory.createPotion("healing");
            healingPotion.drink();

            Potion invisibilityPotion = factory.createPotion("invisibility");
            invisibilityPotion.drink();

            Potion strengthPotion = factory.createPotion("strength");
            strengthPotion.drink();

            // Attempt to create an unknown potion type
            Potion unknownPotion = factory.createPotion("flying");
            unknownPotion.drink();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
```

## Error Handling

- **Type Checking**: The factory method `createPotion` uses `toLowerCase()` to ensure case-insensitivity.
- **Exception Handling**: The factory method throws an `IllegalArgumentException` with a descriptive message if the potion type is unknown.
- **Client Code**: The client code catches the `IllegalArgumentException` and prints the error message to standard error.

## Usage

1. Clone the repository.
2. Compile the Java files:
    ```sh
    javac *.java
    ```
3. Run the main class:
    ```sh
    java Main
    ```

You should see the following output:

```plaintext
You feel your wounds healing!
You become invisible!
You feel incredibly strong!
Unknown potion type: flying
``