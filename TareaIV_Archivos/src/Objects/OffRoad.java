package Objects;


public class OffRoad extends Car {
    private int capacity;
    private boolean available;

    public OffRoad(String numberPlate, int price, String brand, String type, String color, int capacity, boolean available) {
        super(brand, color, numberPlate, type, price);
        this.capacity = capacity;
        this.available = available;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    @Override
    public String[] getInfo() {
        String[] carInfo = super.getInfo();
        String newInfo = carInfo[0];
        for (int i = 1; carInfo.length > i; i++) {
            newInfo = newInfo + ", " + carInfo[i];
        }
        newInfo = newInfo + ", " + getCapacity() + ", " + isAvailable();
        return carInfo = newInfo.split(", ");
    }
}
