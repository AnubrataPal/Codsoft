import java.util.Scanner;

public class Student_Grade
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input of marks obtained in each subject
        System.out.println("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int Marks[] = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i+1) + ": ");
            Marks[i] = scanner.nextInt();
        }
    
        // Calculate Total Marks
        int totalMarks = 0;
        for (int i=0;i<numSubjects;i++)
        {
            totalMarks = totalMarks+Marks[i];
        }

        // Calculate Average Percentage
        double AvgPercentage = (double) totalMarks / (numSubjects * 100) * 100;

        // Grade Calculation
        char grade;
        if (AvgPercentage >= 90) {
            grade = 'A';
        } else if (AvgPercentage >= 80) {
            grade = 'B';
        } else if (AvgPercentage >= 70) {
            grade = 'C';
        } else if (AvgPercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("Grade Calculation Procedure...");
        System.out.println("If Average Percentage >= 90: A");
        System.out.println("If 80 < Average Percentage <= 90 : B");
        System.out.println("If 70 < Average Percentage <= 80 : C");
        System.out.println("If 60 < Average Percentage <= 70 : D");
        System.out.println("If Average Percentage <= 60 : F");

        System.out.println("\nYour Results...");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + AvgPercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}