public class Laptop {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String screenSize;

    private Laptop(Builder builder) {
        if (builder.CPU == null || builder.RAM == null || builder.storage == null) {
            throw new IllegalArgumentException("CPU, RAM, and storage are required components");
        }
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.screenSize = builder.screenSize;
    }
