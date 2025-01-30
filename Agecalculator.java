import java.util.Scanner;
import java.time.Year;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = Year.now().getValue();
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;
        if (age >= 0) {
            System.out.println("You are " + age + " years old.");
        } else {
            System.out.println("Invalid birth year!");
        }

        scanner.close();
    }
}

