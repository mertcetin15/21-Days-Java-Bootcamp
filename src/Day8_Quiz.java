public class Day8_Quiz {
    static void main() {
        showMenu();
        double totalBill = calculateTotal(3.5, 2);
        System.out.println("Total Amount: " + totalBill);
    }

    public static void showMenu() {
        System.out.println("Welcome to The Berlin Coffee");
        System.out.println("Espresso: €3.5, Latte: €4.5");
    }

    public static double calculateTotal(double a, int b) {
        return a * b;
    }
}
