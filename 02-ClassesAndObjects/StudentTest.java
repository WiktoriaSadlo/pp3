public class StudentTest {
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        s.semester=3;
        s.grade=4;
        System.out.println(s.name + " " + s.age);
        s.displayAge();
        s.displayStudentData();

        Student k = new Student();

        k.name = "Karolina";
        k.age = 23;
        System.out.println(k.name + " " + k.age);

        Student g = new Student();
        g.name = "Hubert";
        g.age = 21;
        System.out.println(g.name + " " + g.age);

    }

    

}
