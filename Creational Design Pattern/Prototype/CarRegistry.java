class CarRegistry {
    private Map<String, Car> carMap;

    public CarRegistry() {
        this.carMap = new HashMap<>();
        initialize();
    }

    private void initialize() {
        Car defaultCar = new Car("Toyota Camry", "Silver", 2022);
        carMap.put("default", defaultCar);
    }

    public void addCar(String key, Car car) {
        carMap.put(key, car);
    }

    public Car getCar(String key) throws CloneNotSupportedException {
        Car car = carMap.get(key);
        if (car == null) {
            throw new IllegalArgumentException("Car with key " + key + " not found.");
        }
        return car.clone();
    }
}