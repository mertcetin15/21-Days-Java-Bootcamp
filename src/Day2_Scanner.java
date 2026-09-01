import java.util.Scanner;

public class Day2_Scanner {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = input.next();
        System.out.println("Please enter your age: ");
        int userAge = input.nextInt();
        System.out.println("Welcome " + userName + " ,from the records you are " + userAge + " years old.");
    }
}
