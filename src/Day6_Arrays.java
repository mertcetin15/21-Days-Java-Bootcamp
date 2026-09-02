public class Day6_Arrays {
    static void main() {
        int[] studentAges = {20, 22, 19, 21, 24};
        System.out.println("First student: " + studentAges[0]);
        System.out.println("Third student: " + studentAges[2]);

        for (int  i = 0; i < studentAges.length; i++){
            System.out.println("Student " + i + " age: " + studentAges[i]);
        }

    }
}
