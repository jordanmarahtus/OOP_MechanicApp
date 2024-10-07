package app.services;

public enum ServiceType {
    OIL_CHANGE("Oil Change"),
    TYRES("Tyres"),
    FULL_SERVICE("Full Service"),
    BRAKE_SERVICE("Brake Service"),
    ENGINE_SERVICE("Engine Service"),
    MISCELLANEOUS("Miscellaneous");

    private final String description;

    ServiceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
