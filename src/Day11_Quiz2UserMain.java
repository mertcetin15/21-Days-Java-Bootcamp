public class Day11_Quiz2UserMain {
    static void main() {
        Day11_Quiz2UserClass user1 = new Day11_Quiz2UserClass("Mert", 20);
        System.out.println(user1.getAge());
        user1.setAge(40);
        System.out.println(user1.getAge());
        user1.setAge(-30);
        System.out.println(user1.getAge());
    }
}
