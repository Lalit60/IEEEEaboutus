import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of subjects
        System.out.println("Enter the number of subjects: ");
        int sub = sc.nextInt();

        // Create an array to store the marks in each subject
        int[] marks = new int[sub];

        // Get the marks in each subject
        for (int i = 0; i < sub; i++) {
            System.out.println("Enter the marks in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Calculate the total marks
        int tm = 0;
        for (int i = 0; i < sub; i++) {
            tm += marks[i];
        }

        // Calculate the average percentage
        float avg = (float) tm / sub;

        // Calculate the grade
        String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("Total marks: " + tm);
        System.out.println("Average percentage: " + avg);
        System.out.println("Grade: " + grade);
    }
}