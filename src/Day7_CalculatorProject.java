import java.util.Scanner;

public class Day7_CalculatorProject {
    static void main() {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select an action: 1-Add, 2-Substract, 3-Multiply, 4-Divide, 0-Exit: ");
            choice = input.nextInt();

            if (choice != 0) {
                System.out.println("Continuing...");
                System.out.println("Enter the first number: ");
                double num1 = input.nextDouble();
                System.out.println("Enter the second number: ");
                double num2 = input.nextDouble();

                if (choice == 1) {
                    double result1 = num1 + num2;
                    System.out.println("Result: " + result1);
                } else if (choice == 2) {
                    double result2 = num1 - num2;
                    System.out.println("Result: " + result2);
                } else if (choice == 3) {
                    double result3 = num1 * num2;
                    System.out.println("Result: " + result3);
                } else if (choice == 4) {
                    double result4 = num1 / num2;
                    System.out.println("Result: " + result4);
                } else
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }
}
