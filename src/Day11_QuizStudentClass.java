public class Day11_QuizStudentClass {
    private String studentName;
    private double gpa;

    public Day11_QuizStudentClass(String studentName, double gpa){
        this.studentName = studentName;
        this.gpa = gpa;
    }
    public String getStudentName() {
        return studentName;
    }
    public double getGpa() {
        return gpa;
    }
  public void setGpa(double newGpa){
        if (newGpa >= 0.0 && newGpa <= 4.0){
            this.gpa = newGpa;
        } else {
          System.out.println("Wrong note!");
      }
  }

}
