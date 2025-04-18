import java.io.*;
import java.util.*;

public class AI {
    private static final Map<String, List<String>> categories = new HashMap<>();

    static {
        loadCategories("categories");
    }

    public static void loadCategories(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String category = parts[0].trim();
                    String[] keywords = parts[1].split(",");
                    List<String> keywordList = new ArrayList<>();
                    for (String keyword : keywords) {
                        keywordList.add(keyword.trim().toLowerCase());
                    }
                    categories.put(category, keywordList);
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading categories: " + e.getMessage());
        }
    }

    public static String categorize(String complaint) {
        complaint = complaint.toLowerCase();
        for (Map.Entry<String, List<String>> entry : categories.entrySet()) {
            for (String keyword : entry.getValue()) {
                if (complaint.contains(keyword)) {
                    return entry.getKey();
                }
            }
        }
        return "General";
    }
}
