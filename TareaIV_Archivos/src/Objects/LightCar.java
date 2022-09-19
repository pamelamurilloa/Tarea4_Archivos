package Objects;


public class LightCar extends Car {
    private int force;
    private int maxVelocity;

    public LightCar(String numberPlate, int price, String brand, String type, String color, int force, int maxVelocity) {
        super(brand, color, numberPlate, type, price);
        this.force = force;
        this.maxVelocity = maxVelocity;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
    
    @Override
    public String[] getInfo() {
        String[] carInfo = super.getInfo();
        String newInfo = carInfo[0];
        for (int i = 1; carInfo.length > i; i++) {
            newInfo = newInfo + ", " + carInfo[i];
        }
        newInfo = newInfo + ", " + getForce() + ", " + getMaxVelocity();
        return carInfo = newInfo.split(", ");
    }
    
}
