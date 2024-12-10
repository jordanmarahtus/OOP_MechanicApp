package app.mechanic;
import app.services.ServiceRecord;
import app.vehicles.Car;
import app.services.ServiceType;

import java.time.LocalDate;

public class Mechanic {
    private String name;
    private int id;
    private String job;

    // Constructor
    public Mechanic(String name, int id, String expertise) {
        this.name = name;
        this.id = id;
        this.job = expertise;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

    public void performService(Car car, ServiceType serviceType) {
        ServiceRecord record = new ServiceRecord(serviceType.getDescription(), LocalDate.now(), this.name);
        car.addService(record);
        System.out.println("Service performed: " + serviceType + " by " + this.name);
    }

    public void performService(Car car, ServiceType serviceType, String additionalDetails) {
        ServiceRecord record = new ServiceRecord(serviceType.getDescription(), LocalDate.now(), this.name);
        car.addService(record);
        System.out.println("Service performed: " + serviceType + " by " + this.name + ". Details: " + additionalDetails);
    }

    public void updateVehicleYear(Car car, int newYear) {
        car = new Car(car.getMake(), car.getModel(), newYear);
        car.displayInfo();  // Display the updated year
    }

    public void displayInfo() {
        System.out.println("Mechanic ID: " + id + ", Name: " + name + ", Job: " + job);
    }
}