package javaStuff.classesAndObjects;

public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private String VIN;
    private int price;
    private String color;

    public Car() {
        make = null;
        model = null;
        year = 0;
        mileage = 0;
        VIN = null;
        price = 0;
        color = null;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year, int mileage, String VIN, int price, String color) {
        this.make = make; 
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.VIN = VIN;
        this.price = price;
        this.color = color;
    }

    //getters and setters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getMileage() {
        return mileage;
    }
    public String getVIN() {
        return VIN;
    }
    public int getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }
    public void setModel(String newModel) {
        this.model = newModel;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
    public void setMileage(int newMileage) {
        this.mileage = newMileage;
    }
    public void setVIN(String newVIN) {
        this.VIN = newVIN;
    }
    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void totalLoss() {
        //normallly, use the VIN to check database for total loss status
        if(VIN.equals(null)) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "make: " + make +
                "model: " + model + 
                "year: " + year + 
                "mileage: " + mileage + 
                "VIN: " + VIN +
                "price: " + price + 
                "color: " + color;

    }
}
