package Objects;


public class LightCar extends Car {
    private int force;
    private int maxVelocity;

    public LightCar(int force, int maxVelocity, String brand, String color, String numberPlate, String type, int price) {
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
    
    
}
