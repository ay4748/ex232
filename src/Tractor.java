public class Tractor extends Heavy
{
    String type;

    @Override
    public String toString() {
        return "Tractor{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Tractor(int carNum, int age, int wheels, boolean isWheelSteering, int polution, int towCount, String type) {
        super(carNum, age, wheels, isWheelSteering, polution, towCount);
        this.type = type;
    }
}
