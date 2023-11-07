public class StringExercise {
    static String txt = "How a nice day!";

    int displayNumChar() {
        return txt.length();
    }

    String display9Char() {
        return txt.substring(0, 9);
    }

    boolean displayDay() {
        if (txt.substring(-4, -1)=="day!") {
            return true;
        }
        return false;
    }
}
