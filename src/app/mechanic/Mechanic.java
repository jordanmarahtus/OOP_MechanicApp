package app.mechanic;

public class Mechanic {
    private String name;
    private int id;
    private String job;

    public Mechanic(String name, int id, String expertise) {
        this.name = name;
        this.id = id;
        this.job = expertise;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getJob() {
        return job;
    }
}