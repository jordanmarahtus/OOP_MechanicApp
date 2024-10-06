package app.services;

import java.time.LocalDate;

public record ServiceRecord(String serviceType, LocalDate date, String mechanicName) {
    @Override
    public String toString() {
        return serviceType + " on " + date + " by " + mechanicName;
    }
}