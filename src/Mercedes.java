public class Mercedes extends Truck{
    int horsePower;

    @Override
    public String toString() {
        return "Mercedes{" +
                "horsePower=" + horsePower +
                '}';
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Mercedes(int carNum, int age, int wheels, boolean isWheelSteering, int polution, int towCount, int maxWeight, int horsePower) {
        super(carNum, age, wheels, isWheelSteering, polution, towCount, maxWeight);
        this.horsePower = horsePower;
    }
}
