public class TVTest {
    public static void main(String[] args) {
        TV tv1 = new TV(true, 5,17);
        tv1.On();
        tv1.channelDown();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.displayStatus();
    }
}
