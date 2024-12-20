import app.mechanic.Mechanic;
import app.vehicles.Car;
import app.services.ServiceType;
import app.vehicles.Motorbike;
import app.vehicles.Vehicle;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        Car car1 = new Car("vauxhall", "corsa", 2013);

        var car2 = new Car("Audi", "A3", 2013);

        Mechanic mechanic1 = new Mechanic("larry", 1, "Oil Change");
        mechanic1.updateVehicleYear(car2, 2012);
        System.out.println("------------------------------");
        mechanic1.performService(car1, ServiceType.OIL_CHANGE);
        System.out.println("------------------------------");
        mechanic1.performService(car1, ServiceType.BRAKE_SERVICE);
        System.out.println("------------------------------");
        car1.displayInfo();
        System.out.println("------------------------------");
        mechanic1.displayInfo();

        MechanicManagementSystem system = new MechanicManagementSystem();
        system.start();
    }
}