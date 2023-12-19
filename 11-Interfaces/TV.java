public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume{
    boolean On;
    int channel,volume;
    

    public TV(boolean on, int channel,int volume) {
        this.On = on;
        if(on == true && channel>=1 && channel<=99) {
            this.channel = channel;
        }
        if(on == true && volume>=1 && volume<=10) {
            this.volume=volume;
        }
    }

    @Override
    public void Off() {
        On = false;
        
    }

    @Override
    public void On() {
        if (On==false) {
            volume=1;
            channel=1;
        }
        On = true;
    }

    

    @Override
    public void channelDown() {
        if (On==true && (channel++<=99)) {
            channel--;
        }
        
    }

    @Override
    public void channelUp() {
        if (On==true && (channel--)>=1) {
            channel--;
        }
    }

    @Override
    public void setChannel(int channelNum) {
        if (On==true && channelNum>=1 && channelNum<=99) {
            this.channel=channelNum;
        }
        
    }

    

    @Override
    public void volumeDown() {
        if (On==true && (volume--)>=1) {
            volume--;
        }
        
    }

    @Override
    public void volumeUp() {
        if (On==true && (volume+=1)<=10) {
            volume+=1;
        }
        
    }

    void displayStatus() {
        if(On==true) {
            System.out.printf("The Tv is on,\nChannel: %d,\nVolume: %d\n",channel,volume);
        } else {
            System.err.println("The TV is off");
        }
        
    }
    
}
