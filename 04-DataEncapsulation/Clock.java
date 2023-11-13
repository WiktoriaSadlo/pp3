package bin;

public class Clock {
    private int minute;
    private int hour;

    public Clock(int hour,int minute) {
        if(hour>=0 && hour<24 && minute>=0 && minute<60) {
            this.hour = hour;
            this.minute = minute;
        }
    }

    void addMinute() {
        if(minute<59){
            minute++;
        }else if(minute==59 && hour!=23) {
            hour++;
            minute=00;
        } else {
            hour=00;
            minute=00;
        }
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute>=0 && minute<60) {
            this.minute = minute;
        }
    }

    public void setHour(int hour) {
        if (hour>=0 && hour<24) {
            this.hour = hour;
        }
    }

    
}
