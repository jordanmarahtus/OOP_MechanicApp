package app.vehicles;
import app.services.ServiceRecord;
import java.util.ArrayList;
import java.util.List;

// Shows inheritance - the motorbike class will inherit make, model, year from the vehicle class but also has its own unique list of service records
public class Motorbike extends Vehicle {
    private List<ServiceRecord> serviceHistory;

    // Super() is called here as it will refer to the parent class constructor Vehicle
    // The super() function is used to give access to methods and properties of a parent or sibling class.
    // The super() function returns an object that represents the parent class.
    public Motorbike(String make, String model, int year) {
        super(make, model, year);
        this.serviceHistory = new ArrayList<>();
    }

    public void addService(ServiceRecord service) {
        serviceHistory.add(service);
    }

    public List<ServiceRecord> getServiceHistory() {
        return new ArrayList<>(serviceHistory);
    }

    // The usage of override displays polymorphism
    // Method Overriding is done when a child or a subclass has a method with the same name, parameters, and return type as the parent or the superclass;
    // then that function overrides the function in the superclass.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Service History: " + (serviceHistory.isEmpty() ? "No services yet." : serviceHistory.size() + " services"));
    }
}