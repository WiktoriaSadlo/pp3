public class InternetDevice {
    String name;
    boolean connected;
    static int connectedDevices = 0;

    InternetDevice(String name) {
        this.name = name;
        this.connected = false;
    }

    void connect() {
        if(!connected){
            connected = true;
            connectedDevices++;
        }
    }

    void disconnect() {
        if(connected){
            connected=false;
            connectedDevices--; 
        }
    }

    boolean isConnected() {
        return connected;
    }

    void displayStatus(){
        System.out.println("Device " + name + "\nConnected to Internet: " + connected);
    }

    void displayConnections() {
        System.out.println("Number of connected devices: " + connectedDevices);
    }



    public static void main(String[] args) {
        InternetDevice telefon = new InternetDevice("Iphone 13");
        telefon.connect();
        telefon.disconnect();
        telefon.displayStatus();
        InternetDevice laptop = new InternetDevice("Asus ZenBook");
        laptop.displayStatus();
        laptop.connect();
        laptop.displayConnections();
    }

}
