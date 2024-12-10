package app.vehicles;
import app.services.ServiceRecord;
import java.util.ArrayList;
import java.util.List;

// Shows inheritance - the cAR class will inherit make, model, year from the vehicle class but also has its own unique list of service records
public final class Car extends Vehicle implements Servicable {
    private List<ServiceRecord> serviceHistory;

    // this.make etc. refers to the current instance of the class
    // The this keyword refers to the current object in a method or constructor.
    // The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name
    public Car(String make, String model, int year) {
        super(make, model, year);
        this.serviceHistory = new ArrayList<>();
    }

    public Car(String make, String model)
    {
        super(make, model);
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

    @Override
    public void performService(String serviceType){
        System.out.println("Service performed:  " + serviceType);
    }
}