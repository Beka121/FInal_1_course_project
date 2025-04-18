public class Complaint {
    private String name;
    private String description;
    private String resolution;
    private String category;

    public Complaint(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.resolution = "Not resolved";
    }

    public void resolve(String resolution) {
        this.resolution = resolution;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nComplaint: " + description +
                "\nCategory: " + category +
                "\nResolution: " + resolution;
    }
}
