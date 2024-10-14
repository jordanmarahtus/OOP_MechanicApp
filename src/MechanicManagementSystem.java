
import app.mechanic.Mechanic;
import app.vehicles.Car;

import java.util.Scanner;
public class MechanicManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private boolean running = true;
    private int mechanicId = 0;
    private int carId = 0;

    public void start() {
        while (running) {
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addMechanic();
                    break;
                case 2:
                    addCar();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private void addMechanic() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter job: ");
        String job = scanner.nextLine();

        Mechanic mechanic = new Mechanic(name, mechanicId, job);
        System.out.println("Mechanic added");
        mechanic.displayInfo();
        mechanicId++;
    }

    private void addCar() {

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        Car car = new Car(make, model, year);
        System.out.println("Car added" + make + " " + model);
        carId++;

    }

    private void printMenu() {
        System.out.println("Mechanic Management System");
        System.out.println("1. Add Mechanic");
        System.out.println("2. Add Car");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }
}
