import java.util.Scanner;

public class Day2_Calculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        int total = num1 + num2;
        System.out.println("The total of entered numbers is: " + total);
    }
}
