public class Heavy extends Vehicles
{
    int towCount;




    @Override
    public String toString() {
        return "Heavy{" +
                "towCount=" + towCount +
                '}';
    }

    public Heavy(int carNum, int age, int wheels, boolean isWheelSteering, int polution, int towCount) {
        super(carNum, age, wheels, isWheelSteering, polution);
        this.towCount = towCount;
    }

    public int getTowCount() {
        return towCount;
    }

    public void setTowCount(int towCount) {
        this.towCount = towCount;
    }

    @Override
    public float exhaust()
    {
        return towCount * 500 + super.exhaust();
    }

}
