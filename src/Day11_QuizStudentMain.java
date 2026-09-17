public class Day11_QuizStudentMain {
    static void main() {
        Day11_QuizStudentClass myStudent = new Day11_QuizStudentClass("Mert", 2.5);
        myStudent.setGpa(3.8);
        System.out.println(myStudent.getGpa());

        myStudent.setGpa(5.5);
        System.out.println(myStudent.getGpa());
    }
}
