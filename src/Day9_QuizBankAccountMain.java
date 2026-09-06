public class Day9_QuizBankAccountMain {
    static void main() {
        Day9_QuizBankAccountClass myAccount = new Day9_QuizBankAccountClass();
        myAccount.accountHolder = "Mert";
        myAccount.balance = 1000.0;

        myAccount.displayInfo();

        double interest = myAccount.calculateYearInterest();
        System.out.println("Yearly Interest: " + interest);
    }
}
