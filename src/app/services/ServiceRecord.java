package app.services;

import java.time.LocalDate;

// Records in Java are a new kind of class that serve as nominal types, meaning they are transparent carriers for immutable data
// Using a record for ServiceRecord is more straigh forward then a whole class, reducing the boilerplate code
public record ServiceRecord(String serviceType, LocalDate date, String mechanicName) {
    @Override
    public String toString() {
        return serviceType + " on " + date + " by " + mechanicName;
    }
}