public class Day11_EncapsulationMain {
    static void main() {
        Day11_EncapsulationClass myBank = new Day11_EncapsulationClass("Mert", 5000.0);
        System.out.println(myBank.getBalance());
        myBank.setBalance(1500.0);
        myBank.setBalance(-100);
        System.out.println(myBank.getBalance());
    }
}
