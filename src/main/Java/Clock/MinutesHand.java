package main.Java.Clock;

public class MinutesHand  implements Tickable,Resettable {
    private int currentTime;

    public MinutesHand(){
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
