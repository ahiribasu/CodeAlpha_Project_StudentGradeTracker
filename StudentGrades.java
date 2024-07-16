import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double grade;
        char moreGrades;

       
        do {
            System.out.print("Enter a student's grade: ");
            grade = scanner.nextDouble();
            grades.add(grade);
            System.out.print("Do you want to enter another grade? (y/n): ");
            moreGrades = scanner.next().charAt(0);
        } while (moreGrades == 'y' || moreGrades == 'Y');

       
        if (grades.size() > 0) {
            double sum = 0;
            double highest = grades.get(0);
            double lowest = grades.get(0);

            for (double g : grades) {
                sum += g;
                if (g > highest) {
                    highest = g;
                }
                if (g < lowest) {
                    lowest = g;
                }
            }

            double average = sum / grades.size();
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Highest score: %.2f%n", highest);
            System.out.printf("Lowest score: %.2f%n", lowest);
        } else {
            System.out.println("No grades were entered.");
        }
    }
}
