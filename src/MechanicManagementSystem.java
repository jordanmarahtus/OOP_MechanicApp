
import app.mechanic.Mechanic;
import app.vehicles.Car;
import app.vehicles.Motorbike;
import app.vehicles.Vehicle;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class MechanicManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private boolean running = true;
    private int mechanicId = 0;
    private int carId = 0;

    List<Vehicle> vehicles = List.of(
            new Car("Toyota", "Corolla", 2020),
            new Motorbike("Honda", "CBR", 2022),
            new Car("BMW", "5 Series", 2020),
            new Motorbike("Kawasaki", "X", 2020),
            new Car("Jeep", "3", 2019),
            new Motorbike("Hyundai", "123", 2000)
    );

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
                    filterByYear();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private void addMechanic() {
        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }

            System.out.print("Enter job: ");
            String job = scanner.nextLine();
            if (job == null || job.trim().isEmpty()) {
                throw new IllegalArgumentException("Job cannot be empty.");
            }

            Mechanic mechanic = new Mechanic(name, mechanicId, job);
            System.out.println("Mechanic added successfully!");
            mechanic.displayInfo();
            mechanicId++;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private void addCar() {
        try {
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter make: ");
            String make = scanner.nextLine();
            if (make == null || make.trim().isEmpty()) {
                throw new IllegalArgumentException("make cannot be empty.");
            }
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            if (model == null || model.trim().isEmpty()) {
                throw new IllegalArgumentException("model cannot be empty.");
            }
            Car car = new Car(make, model, year);
            System.out.println("Car added : " + make + " " + model);
            carId++;
        }catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }

    }

    private void filterByYear() {
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        // Predicate using the input year
        Predicate<Vehicle> filterByYear = v -> v.getYear() == year;
        // stream to filter and didsplay
        vehicles.stream()
                .filter(filterByYear)
                .forEach(v -> System.out.println(v.getMake() + " " + v.getModel() + " (" + v.getYear() + ")"));
    }
    private void printMenu() {
        System.out.println("Mechanic Management System");
        System.out.println("1. Add Mechanic");
        System.out.println("2. Add Car");
        System.out.println("3. Filter by Year");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
}
