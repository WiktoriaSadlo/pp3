package bin;

public class ClockTest {
    public static void main(String[] args) {
        Clock c = new Clock(17, 59);
        System.out.println(c.getHour()+":"+c.getMinute());
        c.addMinute();
        System.out.println(c.getHour()+":"+c.getMinute());
    }
}
