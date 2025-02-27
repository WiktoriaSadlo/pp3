package bin;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        if (age>=0 && age<150) {
            this.age=age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age>=0 && age<150) {
            this.age=age;
        }
    }

    boolean isAdult() {
        if (age>=18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        System.out.printf("Person name: %s,\nAge: %d,\nIs adult: %b\n", name,age,isAdult());
        return " ";
    }

}
