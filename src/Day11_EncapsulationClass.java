public class Day11_EncapsulationClass {
   private String accountHolder;
   private double balance;

   public Day11_EncapsulationClass(String accountHolder, double balance){
      this.accountHolder = accountHolder;
      this.balance = balance;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double amount){
      if (amount > 0){
         balance = balance + amount;
      } else {
         System.out.println("Wrong amount of money!");
      }
   }

}
