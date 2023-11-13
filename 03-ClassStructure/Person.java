public class Person {
    String name;
    float weight;
    int height;
    float bmi;

    public Person (String name, float weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    void setWeightAndHeight (float weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    String calculateBMI() {
        float heightMeters = height/100f;
        float bmi = weight/(heightMeters*heightMeters);
        System.out.println(bmi);
        this.bmi = bmi;
        return (bmi<18.5) ? "Too low" : (bmi>24.9) ? "Too high" : "Good";
    }

    String displayRecord() {
        return String.format("My name is %s, my weight is equal %f kg and my height is %d cm, my bmi is equal %f",name,weight,height,bmi);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Wiktoria", 65, 170);

        System.out.println(p1.calculateBMI());
        System.out.println(p1.displayRecord());
    }
}
