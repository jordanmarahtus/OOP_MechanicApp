package app.vehicles;
import app.services.ServiceRecord;
import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    private List<ServiceRecord> serviceHistory;

    public Car(String make, String model, int year) {
        super(make, model, year);
        this.serviceHistory = new ArrayList<>();
    }

    public void addService(ServiceRecord service) {
        serviceHistory.add(service);
    }

    public List<ServiceRecord> getServiceHistory() {
        return new ArrayList<>(serviceHistory);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Service History: " + (serviceHistory.isEmpty() ? "No services yet." : serviceHistory.size() + " services"));
    }
}