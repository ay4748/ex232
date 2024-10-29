public class Light extends Vehicles{

    boolean isEngine;


    @Override
    public String toString() {
        return "Light{" +
                "isEngine=" + isEngine +
                '}';
    }

    public Light(int carNum, int age, int wheels, boolean isWheelSteering, int polution, boolean isEngine) {
        super(carNum, age, wheels, isWheelSteering, polution);
        this.isEngine = isEngine;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void setEngine(boolean engine) {
        isEngine = engine;
    }
}
