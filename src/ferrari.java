public class ferrari extends Regular {
    String engine;

    @Override
    public String toString() {
        return "ferrari{" +
                "engine='" + engine + '\'' +
                '}';
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ferrari(String carNum, int age, int wheels, boolean isWheelSteering, int polution, int passengerCount, String engine) {
        super(carNum, age, wheels, isWheelSteering, polution, passengerCount);
        this.engine = engine;
    }
}
