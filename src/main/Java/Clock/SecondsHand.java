package main.Java.Clock;

public class SecondsHand implements Tickable,Resettable {
    private int currentTime;


    public SecondsHand(){
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
