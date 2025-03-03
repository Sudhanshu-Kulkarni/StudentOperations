import java.util.ArrayList;

public class StudentOperations {
    ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }

    public void searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.display();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.display();
                return;
            }
        }
        System.out.println("Student with name '" + name + "' not found.");
    }

    public void searchByPosition(int position) {
        if (position > 0 && position <= students.size()) {
            students.get(position - 1).display();
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void updateStudent(long prn, String newName) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.setName(newName);
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
    
    public void deleteStudent(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}


