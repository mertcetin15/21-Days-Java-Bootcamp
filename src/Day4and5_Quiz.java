public class Day4and5_Quiz {
    static void main() {
        for (int i = 1; i <= 20; i++){
        if ( i % 4 == 0) {
            System.out.println("Processing data block: " + i);
            }
        }
        int batteryLevel = 100;
        while (batteryLevel >= 0){
            System.out.println("Current battery level: " + batteryLevel);
            batteryLevel = batteryLevel - 20;
        }
    }
}
