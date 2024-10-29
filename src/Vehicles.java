public class Vehicles {
    int carNum;
    int age;
    int wheels;
    boolean isWheelSteering;
    float polution;

    public Vehicles(int carNum, int age, int wheels, boolean isWheelSteering, int polution) {
        this.carNum = carNum;
        this.age = age;
        this.wheels = wheels;
        this.isWheelSteering = isWheelSteering;
        this.polution = polution;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "carNum=" + carNum +
                ", age=" + age +
                ", wheels=" + wheels +
                ", isWheelSteering=" + isWheelSteering +
                ", polution=" + polution +
                '}';
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isWheelSteering() {
        return isWheelSteering;
    }

    public void setWheelSteering(boolean wheelSteering) {
        isWheelSteering = wheelSteering;
    }

    public float getPolution() {
        return polution;
    }

    public void setPolution(float polution) {
        this.polution = polution;
    }

    public float exhaust()
    {
        return this.polution * 60;
    }


}
