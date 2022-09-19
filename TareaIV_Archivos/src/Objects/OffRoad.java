package Objects;


public class OffRoad extends Car {
    private int capacity;
    private boolean available;

    public OffRoad(int capacity, boolean available, String brand, String color, String numberPlate, String type, int price) {
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
    
}
