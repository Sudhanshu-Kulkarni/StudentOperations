// Name: Sudhanshu Kulkarni
// PRN: 23070126132
// Batch: AIML-B3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner to take input from the user
        StudentOperations operations = new StudentOperations();  // Object to perform various student operations
        int choice;  // Variable to store user's menu choice

        // A loop to keep the program running until the user chooses to exit
        do {
            // Display the main menu of the Student Management System
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
            choice = scan.nextInt();  // Take user's choice as input
            scan.nextLine();  // Consume newline character left by nextInt()

            // Perform the chosen operation based on user input
            switch (choice) {
                case 1:
                    // Option 1: Add a new student to the system
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();  // Take student's name as input
                    System.out.print("Enter PRN: ");
                    long prn = scan.nextLong();  // Take student's PRN (Permanent Registration Number) as input
                    operations.addStudent(new Student(name, prn));  // Add the student to the system
                    break;
                case 2:
                    // Option 2: Display all the students currently stored in the system
                    operations.displayStudents();
                    break;
                case 3:
                    // Option 3: Search for a student by their PRN
                    System.out.print("Enter PRN to search: ");
                    long searchPrn = scan.nextLong();  // Take PRN as input for search
                    operations.searchByPRN(searchPrn);  // Search for the student by PRN
                    break;
                case 4:
                    // Option 4: Search for a student by their Name
                    System.out.print("Enter Name to search: ");
                    String searchName = scan.nextLine();  // Take Name as input for search
                    operations.searchByName(searchName);  // Search for the student by Name
                    break;
                case 5:
                    // Option 5: Search for a student by their Position in the list
                    System.out.print("Enter Position to search: ");
                    int pos = scan.nextInt();  // Take Position as input for search
                    operations.searchByPosition(pos);  // Search for the student by Position
                    break;
                case 6:
                    // Option 6: Update details of an existing student
                    System.out.print("Enter PRN to update: ");
                    long updatePrn = scan.nextLong();  // Take PRN of the student to be updated
                    scan.nextLine();  // Consume newline
                    System.out.print("Enter New Name: ");
                    String newName = scan.nextLine();  // Take the new name to update
                    operations.updateStudent(updatePrn, newName);  // Update the student's information
                    break;
                case 7:
                    // Option 7: Delete a student from the system
                    System.out.print("Enter PRN to delete: ");
                    long deletePrn = scan.nextLong();  // Take PRN of the student to be deleted
                    operations.deleteStudent(deletePrn);  // Delete the student from the system
                    break;
                case 8:
                    // Option 8: Exit the system
                    System.out.println("Exiting... Thank you!");  
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);  // Continue looping until the user chooses to exit (choice 8)

        scan.close();  // Close the scanner after finishing input
    }
}
