public static class Builder {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String screenSize;

    public Builder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public Builder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public Builder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Builder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public Builder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Laptop build() {
        return new Laptop(this);
    }
}
@Override
public String toString() {
    return "Laptop [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", GPU=" + GPU + ", screenSize=" + screenSize + "]";
}
}