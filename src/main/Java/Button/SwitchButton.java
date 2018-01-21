package main.Java.Button;


import main.Java.Clock.Clock;

public class SwitchButton implements PressableButton,UnPressableButton{
    private boolean isDown;
    private Clock clock;
    private int id;

    public SwitchButton(Clock clock,int id){
        this.clock = clock;
        this.id = id;
    }

    @Override
    public void pressButton() {
        System.out.println();
        if(!isDown) {
            System.out.println(id + " Was pressed");
            isDown = true;
            clock.run();
        }
    }

    public void unPressButton() {
        if(isDown){
            isDown = false;
            clock.terminate();
        }
    }
    public boolean isDown(){
        return isDown;
    }


    public int getId() {
        return id;
    }
}
