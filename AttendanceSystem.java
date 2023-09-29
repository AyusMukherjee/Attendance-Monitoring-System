import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AttendanceSystem {
    private Map<String, Boolean> attendanceRecord;

    public AttendanceSystem() {
        attendanceRecord = new HashMap<>();
    }

    public void markAttendance(String studentName) {
        attendanceRecord.put(studentName, true);
    }

    public void displayAttendance() {
        System.out.println("Attendance Record:");
        for (Map.Entry<String, Boolean> entry : attendanceRecord.entrySet()) {
            System.out.println(entry.getKey() + ": " + (entry.getValue() ? "Present" : "Absent"));
        }
    }

    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    attendanceSystem.markAttendance(studentName);
                    break;
                case 2:
                    attendanceSystem.displayAttendance();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}