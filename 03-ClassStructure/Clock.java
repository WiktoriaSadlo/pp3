public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    Clock(){
        hour=00;
        minute=00;
    }

    Clock(int hour,int minute) {
        if (hour<24 && hour>=0 && minute>=0 && minute<60) {
            this.hour = hour;
            this.minute = minute;
        }
    }
    
    void setClock() {
        minute=00;
        hour=00;
    }

    void setAlarm(int hour,int minute){
        if (hour<24 && hour>=0 && minute>=0 && minute<60) {
            this.alarmHour = hour;
            this.alarmMinute = minute;
        }
    }

    void runAlarm(){
        if (hour==alarmHour && minute==alarmMinute) {
            System.out.println("beep-beep-beep-beep !!");
        }
    }

    void setClock(int hour,int minute) {
        if (hour<24 && hour>=0 && minute>=0 && minute<60) {
            this.hour = hour;
            this.minute = minute;
        }
    }

    void displayTime() {
        System.out.printf("%d:%d\n",hour,minute);
    }

    void addOneMinute() {
        if (minute<59) {
            minute++;
        }else if (hour==23){
            minute=00;
            hour=00;
        }else{
            minute=00;
            hour++;
        }
    }

    public static void main(String[] args) {
        Clock n1 = new Clock(12,47);
        n1.displayTime();
        n1.setClock(18, 14);
        n1.displayTime();
        n1.setAlarm(18, 15);
        n1.runAlarm();
        n1.addOneMinute();
        n1.runAlarm();
        n1.displayTime();
        n1.setClock(20, 59);
        n1.addOneMinute();
        n1.displayTime();
    }
}
