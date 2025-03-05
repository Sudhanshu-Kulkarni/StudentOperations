import java.util.ArrayList;

// This class handles all student-related operations like adding, searching, updating, and deleting students.
public class StudentOperations {
    ArrayList<Student> students; // List to store Student objects

    // Constructor: Initializes an empty list of students.
    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    // Adds a new student to the list.
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully."); // Confirmation message
    }

    // Displays details of all students in the list.
    public void displayStudents() {
        for (Student student : students) {
            student.display(); // Calls the display method of each student
        }
    }

    // Searches for a student by PRN (unique ID) and displays their details if found.
    public void searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) { // Checks if the PRN matches
                student.display();
                return; // Exit after finding the student
            }
        }
        System.out.println("Student with PRN " + prn + " not found."); // Message if no match is found
    }

    // Searches for a student by name (case insensitive) and displays their details if found.
    public void searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) { // Case-insensitive comparison
                student.display();
                return; // Exit after finding the student
            }
        }
        System.out.println("Student with name '" + name + "' not found."); // Message if no match is found
    }

    // Searches for a student based on their position in the list (1-based index).
    public void searchByPosition(int position) {
        if (position > 0 && position <= students.size()) { // Check if position is valid
            students.get(position - 1).display(); // Adjusting for zero-based indexing
        } else {
            System.out.println("Invalid position."); // Error message for out-of-range position
        }
    }

    // Updates a student's name based on their PRN.
    public void updateStudent(long prn, String newName) {
        for (Student student : students) {
            if (student.getPRN() == prn) { // If PRN matches, update name
                student.setName(newName);
                System.out.println("Student details updated successfully.");
                return; // Exit after updating
            }
        }
        System.out.println("Student with PRN " + prn + " not found."); // Message if no match is found
    }

    // Deletes a student from the list based on their PRN.
    public void deleteStudent(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) { // If PRN matches, remove student
                students.remove(student);
                System.out.println("Student removed successfully.");
                return; // Exit after deletion
            }
        }
        System.out.println("Student with PRN " + prn + " not found."); // Message if no match is found
    }
}
