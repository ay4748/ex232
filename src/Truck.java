public class Truck extends Heavy{
    int maxWeight;

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                '}';
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Truck(int carNum, int age, int wheels, boolean isWheelSteering, int polution, int towCount, int maxWeight) {
        super(carNum, age, wheels, isWheelSteering, polution, towCount);
        this.maxWeight = maxWeight;
    }

    @Override
    public float exhaust()
    {
        return (float) (super.exhaust() * 1.5);
    }
}
