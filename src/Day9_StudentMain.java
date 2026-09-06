public class Day9_StudentMain {
    static void main() {
       Day9_StudentClass student1 = new Day9_StudentClass();
       student1.name = "Mert";
       student1.age = 20;
       student1.university = "University of Europe for Applied Sciences";
        System.out.println("Registered Student: " + student1.name);

       student1.study();
       int myGradYear = student1.calculatorGraduationYear();
        System.out.println("Estimate Graduation Year: " + myGradYear);
    }
}
