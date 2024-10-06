package app.mechanic;
import app.services.ServiceRecord;
import app.vehicles.Car;

import java.time.LocalDate;

public class Mechanic {
    private String name;
    private int id;
    private String job;

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

    public void performService(Car car, String serviceType) {
        ServiceRecord record = new ServiceRecord(serviceType, LocalDate.now(), this.name);
        car.addService(record);
        System.out.println("Service performed: " + serviceType + " by " + this.name);
    }

    public void displayInfo() {
        System.out.println("Mechanic ID: " + id + ", Name: " + name + ", Job: " + job);
    }
}