import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades) {
        double[] posGrades = {2.0,2.5,3.0,3.5,4.0,4.5,5.0,5.5};
        this.studentName= name;
        this.grades=new double[numberOfGrades];
        Random generator = new Random();
        for(int i=0;i<grades.length;i++) {
            grades[i]=posGrades[generator.nextInt(posGrades.length)];
        }
    }

    StudentGrades(String name) {
        this.studentName=name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of grades? ");
        int numOfGrades = scanner.nextInt();
        grades = new double[numOfGrades];
        System.out.println("Enter a grade:");
        for(int i=0;i<numOfGrades;i++) {
            grades[i]=scanner.nextDouble();//Żeby ułamiki działały trzeba je zapisywać z przecinkiem
        }
        scanner.close();
    }

    double lowestGrade() {
        double lowest = grades[0];
        for(int i=0;i<grades.length;i++) {
            if (lowest>=grades[i]) {
                lowest=grades[i];
            }
        }
        return lowest;
    }

    double highestGrade() {
        double highest = grades[0];
        for (int i = 0; i<grades.length;i++) {
            if (highest<=grades[i]) {
                highest=grades[i];
            }
        }
        return highest;
    }

    int numOfGrades() {
        return grades.length;
    }

    double averageGrade() {
        double sum = 0;
        for (int i=0;i<grades.length;i++) {
            sum+=grades[i];
        }
        return sum/grades.length;
    }

    void displayStudent() {
        System.out.printf("Student' name: %s,\nStudent's grades: " + Arrays.toString(grades),studentName);
        System.out.printf("\nNumber of grades %d,\nLowest grade: " + lowestGrade() + ",\nHighest grade: " + highestGrade() + ",\nAverage grade: " + averageGrade() + "\n\n",numOfGrades());
    }

    public static void main(String[] args) {
        double[] aGr ={3.5,4.5,4.0,2.0,5.0,3.5,3.5};
        StudentGrades a = new StudentGrades("Amanda",aGr);
        a.displayStudent();
        double[] jGr={2.0,3.0,2.0,4.5,4.5};
        StudentGrades j = new StudentGrades("James", jGr);
        j.displayStudent();
        StudentGrades b = new StudentGrades("Beata", 4);
        b.displayStudent();
        StudentGrades k = new StudentGrades("Karolina");
        k.displayStudent();
    }
}
