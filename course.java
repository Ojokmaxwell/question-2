import java.util.Scanner;
import java.util.HashMap;

public class Balex {

    public static void main(String[] args) {
        // Create a HashMap to store courses
        HashMap<String, Course> courses = new HashMap<>();

        // Add courses from the table
        courses.put("BSE", new Course("Software Engineering", "BSE", 900000));
        courses.put("BIT", new Course("Information Technology", "BIT", 750000));
        courses.put("BCS", new Course("Computer Science", "BCS", 800000));
        courses.put("BCE", new Course("Computer Engineering", "BCE", 950000));

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Course Code: ");
        String inputCode = scanner.nextLine();

        // Find the course based on the code
        Course foundCourse = courses.get(inputCode);

        // Display the results
        if (foundCourse != null) {
            System.out.println("Course Name: " + foundCourse.name);
            System.out.println("Course Tuition: " + foundCourse.tuition);
        } else {
            System.out.println("Wrong Course Code details");
        }
    }
}