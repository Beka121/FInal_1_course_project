import java.io.FileWriter;
import java.io.IOException;


public class CSVWriter {
    public static void saveComplaint(Complaint complaint) {
        try (FileWriter writer = new FileWriter("complaints.csv", true)) {
            writer.append(complaint.getName()).append(",");
            writer.append(complaint.getDescription().replace(",", " ")).append(",");
            writer.append(complaint.getCategory()).append(",");
            writer.append(complaint.getResolution()).append("\n");
        } catch (IOException e) {
            System.err.println("Error writing to CSV: " + e.getMessage());
        }
    }
}
