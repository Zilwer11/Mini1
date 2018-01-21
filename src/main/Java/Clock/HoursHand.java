package main.Java.Clock;

public class HoursHand implements Tickable,Resettable {
    private int currentTime;

    public HoursHand(){
        this.currentTime=0;
    }

    @Override
    public void reset() {
        this.currentTime=0;
    }

    @Override
    public void tick() {
        currentTime++;
    }
    public int showCurrentTime(){
        return this.currentTime;
    }
}
