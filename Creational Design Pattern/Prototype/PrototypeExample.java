public class PrototypeExample {
    public static void main(String[] args) {
        CarRegistry registry = new CarRegistry();

        // Customizing and cloning a default car
        try {
            Car customCar = registry.getCar("default");
            customCar.setModel("Tesla Model 3");
            customCar.setColor("Red");
            customCar.setYear(2023);

            System.out.println("Customized Car: " + customCar);

            // Cloning the customized car
            Car clonedCar = customCar.clone();
            System.out.println("Cloned Car: " + clonedCar);
        } catch (CloneNotSupportedException | IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}