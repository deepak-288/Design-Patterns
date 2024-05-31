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
