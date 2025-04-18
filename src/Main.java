import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplaintManager manager = new ComplaintManager();

        while (true) {
            System.out.println("\n1. Add Complaint");
            System.out.println("2. List Complaints");
            System.out.println("3. Resolve Complaint");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter complaint: ");
                    String desc = sc.nextLine();
                    manager.addComplaint(name, desc);
                    break;
                case 2:
                    manager.listComplaints();
                    break;
                case 3:
                    System.out.print("Enter complaint number to resolve: ");
                    int index = Integer.parseInt(sc.nextLine()) - 1;
                    System.out.print("Enter resolution: ");
                    String resolution = sc.nextLine();
                    manager.resolveComplaint(index, resolution);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
