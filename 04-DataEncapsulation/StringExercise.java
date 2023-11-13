package bin;

public class StringExercise {
    String txt;

    //a
    int displayNumChar() {
        return txt.length();
    }

    //b
    String display9Char() {
        return txt.substring(0, 9);
    }

    //c
    boolean displayDay() {
        if (txt.endsWith("day!")) {
            return true;
        }
        return false;
    }

    //d
    boolean displayNotEmpty() {
        return (!txt.isEmpty());
    }

    //e
    int lastE(){
        return txt.lastIndexOf("e");
    }

    //f
    String spaceReplace() {
        return txt.replace(" ", "-");
    }

    //g
    String upperCase() {
        return txt.toUpperCase();
    }
    public static void main(String[] args) {

        StringExercise t = new StringExercise();
        t.txt = "Have a nice day!";

        System.out.println(t.display9Char());
        System.out.println(t.displayDay());
        System.out.println(t.displayNotEmpty());
        System.out.println(t.lastE());
        System.out.println(t.spaceReplace());
        System.out.println(t.upperCase());
        
    }

}
