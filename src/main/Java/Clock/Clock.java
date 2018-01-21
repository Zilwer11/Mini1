package main.Java.Clock;

public class Clock extends Thread implements Runnable,Resettable{
    private int id;
    private HoursHand hoursHand;
    private MinutesHand minutesHand;
    private SecondsHand secondsHand;
    private StringBuilder output= new StringBuilder(20);
    private volatile boolean running = false;


    public Clock(int id){
        this.id = id;
        secondsHand = new SecondsHand();
        minutesHand = new MinutesHand();
        hoursHand = new HoursHand();
    }
    public void terminate(){
        running=false;

    }





    @Override
    public void run() {
        running=true;
        while(running){
            output.append('\r').append("Clock").append(id).append(' ').append(hoursHand.showCurrentTime()).append(':')
                    .append(minutesHand.showCurrentTime()).append(':').append(secondsHand.showCurrentTime());
            System.out.print(output);
            secondsHand.tick();
            if(secondsHand.showCurrentTime()>=60){
                secondsHand.reset();
                minutesHand.tick();
                if(minutesHand.showCurrentTime()>=60){
                    hoursHand.tick();
                    minutesHand.reset();
                }
            }
            try{Thread.sleep(1000);} catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }






    @Override
    public void reset() {
        hoursHand.reset();
        minutesHand.reset();
        secondsHand.reset();
        running=false;

    }
}
