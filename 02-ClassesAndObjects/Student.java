public class Student {
    String name;
    int age;
    int studentIdCard;
    boolean studentCard;
    int semester;
    float grade;

    void sayHello() {
        System.out.println("Hello from "+name);
    }

    void displayName() {
        System.out.println("My name is "+name);
    }

    void displayAge() {
        System.out.println("My age is "+age);
    }

    void displayStudentData() {
        System.out.println("Student name: "+name+", Student semester:"+semester+", Student average grade: "+grade);
    }

    void changeStatusIdCard() {
        studentCard = !studentCard;
    }

    void displayStudentData2() {
        System.out.println("Student name: "+name+", Student ID card: "+studentIdCard+", ");
    }
}
