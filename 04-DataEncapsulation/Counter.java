package bin;

public class Counter {
    int count = 0;

    void increase() {
        count++;
    }

    void decrease() {
        count--;
    }

    void increase(int n) {
        count+=n;
    }

    void decrease(int n) {
        count-=n;
    }

    int value() {
        return count;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.value()); //returns 0
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value()); //returns 4

    }
}
