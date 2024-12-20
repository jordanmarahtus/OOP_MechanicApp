package app.vehicles;

public sealed class Vehicle permits Car, Motorbike{
    private String make;
    private String model;
    private int year;

    // this.make etc. refers to the current instance of the class
    // The this keyword refers to the current object in a method or constructor.
    // The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Constructor using this()
    // If a vehicle constructor is called passing only 2 parameters, it will hit this
    // Pass the make and model and the default year of 2024 to our constructor above
    public Vehicle(String make, String model) {
        this(make, model, 2024);
    }

    // Public getters show encapsulation by returning private class variables which are only accessible from inside class
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info: " + year + " " + make + " " + model);
    }
}