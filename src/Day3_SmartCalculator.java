import java.util.Scanner;

public class Day3_SmartCalculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println("Please select an operation: 1-Add, 2-Subtract, 3-Multiply, 4-Divide");
        int choice = input.nextInt();

        if (choice == 1){
            double total = num1 + num2;
            System.out.println("Result: " + total);
        } else if (choice == 2){
           double result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (choice == 3){
           double result2 = num1 * num2;
            System.out.println("Result: " + result2);
        } else if (choice == 4){
           double result3 = num1 / num2;
            System.out.println("Result: " + result3);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
