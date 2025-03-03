// Name: Sudhanshu Kulkarni
// PRN: 23070126132
// Batch: AIML-B3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    long prn = scan.nextLong();
                    operations.addStudent(new Student(name, prn));
                    break;
                case 2:
                    operations.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter PRN to search: ");
                    long searchPrn = scan.nextLong();
                    operations.searchByPRN(searchPrn);
                    break;
                case 4:
                    System.out.print("Enter Name to search: ");
                    String searchName = scan.nextLine();
                    operations.searchByName(searchName);
                    break;
                case 5:
                    System.out.print("Enter Position to search: ");
                    int pos = scan.nextInt();
                    operations.searchByPosition(pos);
                    break;
                case 6:
                    System.out.print("Enter PRN to update: ");
                    long updatePrn = scan.nextLong();
                    scan.nextLine(); // Consume newline
                    System.out.print("Enter New Name: ");
                    String newName = scan.nextLine();
                    operations.updateStudent(updatePrn, newName);
                    break;
                case 7:
                    System.out.print("Enter PRN to delete: ");
                    long deletePrn = scan.nextLong();
                    operations.deleteStudent(deletePrn);
                    break;
                case 8:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scan.close();
        
    }
}
