public class Regular extends Vehicles{
    int passengerCount;

    public Regular(int carNum, int age, int wheels, boolean isWheelSteering, int polution, int passengerCount) {
        super(carNum, age, wheels, isWheelSteering, polution);
        this.passengerCount = passengerCount;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "passengerCount=" + passengerCount +
                '}';
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public float exhaust()
    {
        return polution;
    }

    public void noise()
    {
        System.out.println("very loud");
    }

    public void hitchhikers()
    {
        System.out.println("up to 4 hit");
    }
}
