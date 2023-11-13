package bin;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Anna",21);
        p.getAge(); //returns 21
        p.isAdult(); //returns true
        p.setAge(18);
        p.isAdult(); //returns false
        p.toString(); //returns "Anna,17"
    }

}
