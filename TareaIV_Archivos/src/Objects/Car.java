package Objects;


public class Car {
    private String numberPlate;
    private String brand;
    private String color;
    private String type;
    private int price;

    public Car(String brand, String color, String numberPlate, String type, int price) {
        this.brand = brand;
        this.color = color;
        this.numberPlate = numberPlate;
        this.type = type;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
