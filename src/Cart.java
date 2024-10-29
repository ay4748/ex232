public class Cart extends Light{
    float chargingTime;

    @Override
    public String toString() {
        return "Cart{" +
                "chargingTime=" + chargingTime +
                '}';
    }

    public float getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(float chargingTime) {
        this.chargingTime = chargingTime;
    }

    public Cart(int carNum, int age, int wheels, boolean isWheelSteering, int polution, boolean isEngine, float chargingTime) {
        super(carNum, age, wheels, isWheelSteering, polution, isEngine);
        this.chargingTime = chargingTime;
    }

    @Override
    public float exhaust()
    {
        return 0;
    }


    public void hitchhikers()
    {
        System.out.println("no place for hitchhikers");
    }
}
