public class Day9_QuizBankAccountClass {
    String accountHolder;
    double balance;

public void displayInfo(){
    System.out.println("Account Holder: " + accountHolder);
}
public double calculateYearInterest(){
    return balance * 0.05;
}
}
