import java.util.*;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");
 
        System.out.print("Enter the number of subjects: ");
        int numSubjects;
 
        while (true) {
            if (scanner.hasNextInt()) {
                numSubjects = scanner.nextInt();
                if (numSubjects > 0) {
                    break;
                } else {
                    System.out.print("Please enter a positive number of subjects: ");
                }
            } else {
                System.out.print("Invalid input. Enter a positive integer: ");
                scanner.next();  
            }
        }

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            int mark;

            
            while (true) {
                if (scanner.hasNextInt()) {
                    mark = scanner.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        break;
                    } else {
                        System.out.print("Invalid marks. Enter a value between 0 and 100: ");
                    }
                } else {
                    System.out.print("Invalid input. Enter a valid number between 0 and 100: ");
                    scanner.next(); // Clear invalid input
                }
            }

            marks[i] = mark;
            totalMarks += mark;
        }
 
        double averagePercentage = (double) totalMarks / numSubjects;
 
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else if (averagePercentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}