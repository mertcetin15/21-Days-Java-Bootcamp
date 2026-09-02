public class Day6_Quiz {
    static void main() {
        int[] serverTemperatures = {65, 72, 85, 90, 60};
        for (int i = 0; i < serverTemperatures.length; i++){
            if ( serverTemperatures[i] >= 80 ){
                System.out.println("CRITICAL: Server " + i + " is overheating at " + serverTemperatures[i]);
            }else {
                System.out.println("OK: Server " + i + " temparature is " + serverTemperatures[i]);
            }
        }
    }
}
