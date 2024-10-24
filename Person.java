
public class Person {
    private String name;
    private int age;
    private String classStanding;
    private double currentGrade;

   
    public Person(String name, int age, String classStanding, double currentGrade) {
        this.name = name;
        this.age = age;
        this.classStanding = classStanding;
        this.currentGrade = currentGrade;
    }

   
    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
               "Age: " + this.age + "\n" +
               "Class Standing: " + this.classStanding + "\n" +
               "Current Grade: " + this.currentGrade;
    }

   
    public void celebrateBirthday() {
        this.age++;
    }
}
