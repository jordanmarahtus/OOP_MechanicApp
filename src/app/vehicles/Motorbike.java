package app.vehicles;
import app.services.ServiceRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Shows inheritance - the motorbike immutable class will inherit make, model, year from the vehicle class but also has its own unique list of service records
public final class Motorbike extends Vehicle {
    private List<ServiceRecord> serviceHistory;

    // Super() is called here as it will refer to the parent class constructor Vehicle
    // The super() function is used to give access to methods and properties of a parent or sibling class.
    // The super() function returns an object that represents the parent class.
    public Motorbike(String make, String model, int year, List<ServiceRecord> initialServices) {
        super(make, model, year);
        this.serviceHistory = initialServices == null ? List.of() : List.copyOf(initialServices);
    }

    public Motorbike(String make, String model, int year) {
        super(make, model, year);
    }

    // Returns an unmodifiable view of the service history - defensive copying
    public List<ServiceRecord> getServiceHistory() {
        return Collections.unmodifiableList(serviceHistory);
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