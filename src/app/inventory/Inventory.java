package app.inventory;

public class Inventory {
    private String[] parts;

    // Uses varargs to add multipel parts at once

    public void addParts(String... newParts) {
        for (String part : newParts) {
            System.out.println("Part added: " + part);
        }
    }
}
