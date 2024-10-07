package app.services;

// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
public enum ServiceType {
    OIL_CHANGE("Oil Change"),
    TYRES("Tyres"),
    FULL_SERVICE("Full Service"),
    BRAKE_SERVICE("Brake Service"),
    ENGINE_SERVICE("Engine Service"),
    MISCELLANEOUS("Miscellaneous");

    // The final keyword is used to declare a variable constant. It cannot change its value throughout the program - perfect for enum as these will not change description
    private final String description;

    ServiceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // Example of polymorphism
    // instead of using the String method toString, this is implemented to just return the description string - not the string representation of the object
    @Override
    public String toString() {
        return description;
    }
}
