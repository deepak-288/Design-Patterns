# Customizable Laptop Builder

This project demonstrates the use of the Builder Design Pattern to construct different configurations of a customizable laptop. The pattern ensures immutability and flexibility, allowing for the step-by-step construction of complex objects. It includes comprehensive error handling to ensure all necessary components are provided.

## Classes

### Laptop

The `Laptop` class represents the product being constructed. It has the following components:
- `CPU`: The processor of the laptop.
- `RAM`: The memory of the laptop.
- `Storage`: The storage device of the laptop.
- `GPU`: The graphics card of the laptop.
- `ScreenSize`: The size of the laptop's screen.

The `Laptop` class includes a static nested `Builder` class for constructing `Laptop` objects.

### Builder

The `Builder` class is responsible for constructing `Laptop` objects. It provides methods for setting each component of the laptop:
- `setCPU(String CPU)`
- `setRAM(String RAM)`
- `setStorage(String storage)`
- `setGPU(String GPU)`
- `setScreenSize(String screenSize)`

The `build()` method constructs a `Laptop` object. If any of the mandatory components (`CPU`, `RAM`, or `storage`) are missing, it throws an `IllegalArgumentException`.

### Main

The `Main` class contains the `main` method, which demonstrates the creation of `Laptop` objects using the `Builder` class. It includes error handling to catch and print exceptions if mandatory components are missing.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        try {
            Laptop gamingLaptop = new Laptop.Builder()
                    .setCPU("Intel i9")
                    .setRAM("32GB")
                    .setStorage("1TB SSD")
                    .setGPU("NVIDIA RTX 3080")
                    .setScreenSize("17 inch")
                    .build();
            System.out.println(gamingLaptop);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Laptop incompleteLaptop = new Laptop.Builder()
                    .setCPU("Intel i5")
                    .build();
            System.out.println(incompleteLaptop);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}