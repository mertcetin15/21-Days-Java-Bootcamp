public class Day11_Quiz2UserClass {
    private String username;
    private int age;

    public Day11_Quiz2UserClass (String username, int age){
        this.username = username;
        this.age = age;
    }
    public String getUsername (){
        return username;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        if (newAge > 0 && newAge <120){
            this.age = newAge;
        } else {
            System.out.println("Invalid Age!");
        }
    }
}
