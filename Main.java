
public class Main {
    public static void main(String[] args) {
        
        Person me = new Person("John Doe", 20, "Sophomore", 3.5);

       
        Person randomPerson = new Person("Jane Smith", 19, "Freshman", 3.8);

       
        randomPerson.celebrateBirthday();

       
        System.out.println("Details of me:\n" + me);
        System.out.println("\nDetails of random person after birthday:\n" + randomPerson);
    }
}
