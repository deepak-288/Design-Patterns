public class CarFacade {
    private final Engine engine;
    private final Lights lights;
    private final AirConditioning ac;

    public CarFacade() {
        engine = new Engine();
        lights = new Lights();
        ac = new AirConditioning();
    }

    void startCar() {
        engine.start();
        lights.turnOn();
        ac.cool();
    }
}
