public class Day8_Methods {
    static void main() {

        showWelcomeMessage();
        addNumbers(20.3, 67);
        double myResult = multiplyNumbers(5.0, 4.0);
        System.out.println("The result that CEO have: " + myResult);

    }
    public static void showWelcomeMessage () {
        System.out.println("Welcome to the Day 8: Systems are online!");
    }
    public static void  addNumbers (double num1, double num2){
        double result = num1 + num2;
            System.out.println("Result: " + result);
        }
    public static double multiplyNumbers(double a, double b){
        return a * b;
    }
    }

