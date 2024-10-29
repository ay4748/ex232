public class Bicycle extends Light {

    boolean isBasket;

    @Override
    public String toString() {
        return "Bicycle{" +
                "isBasket=" + isBasket +
                '}';
    }

    public boolean isBasket() {
        return isBasket;
    }

    public void setBasket(boolean basket) {
        isBasket = basket;
    }

    public Bicycle(String carNum, int age, int wheels, boolean isWheelSteering, int polution, boolean isEngine, boolean isBasket) {
        super(carNum, age, wheels, isWheelSteering, polution, isEngine);
        this.isBasket = isBasket;
    }
}
