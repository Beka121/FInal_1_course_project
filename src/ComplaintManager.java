import java.util.ArrayList;

public class ComplaintManager {
    private ArrayList<Complaint> complaints = new ArrayList<>();

    public void addComplaint(String name, String description) {
        String category = AI.categorize(description);
        Complaint complaint = new Complaint(name, description, category);
        complaints.add(complaint);
        CSVWriter.saveComplaint(complaint);
    }

    public void listComplaints() {
        if (complaints.isEmpty()) {
            System.out.println("No complaints recorded.");
            return;
        }
        int index = 1;
        for (Complaint c : complaints) {
            System.out.println("Complaint #" + index++);
            System.out.println(c);
            System.out.println("--------------------");
        }
    }

    public void resolveComplaint(int index, String resolution) {
        if (index >= 0 && index < complaints.size()) {
            Complaint complaint = complaints.get(index);
            complaint.resolve(resolution);
            System.out.println("Complaint resolved.");
        } else {
            System.out.println("Invalid complaint number.");
        }
    }
}
