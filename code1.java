import java.util.Scanner;

public class code1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
            sc.nextLine(); // consume newline
        }

        // Display results
        System.out.println("--- Result Summary ---");
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            String grade;

            if (average >= 90)
                grade = "A+";
            else if (average >= 80)
                grade = "A";
            else if (average >= 70)
                grade = "B";
            else if (average >= 60)
                grade = "C";
            else if (average >= 50)
                grade = "D";
            else
                grade = "F";

            System.out.println("Student: " + names[i]);
            System.out.println("Total Marks: " + total);
            System.out.printf("Average: %.2f", average);
            System.out.println("Grade: " + grade);
        }

    }
}
