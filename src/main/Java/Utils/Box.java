package main.Java.Utils;

import main.Java.Button.ResetButton;
import main.Java.Button.SwitchButton;
import main.Java.Clock.Clock;


public class Box {
    private ResetButton resetButton;
    private SwitchButton switchButton1;
    private SwitchButton switchButton2;
    private Clock clock1;
    private Clock clock2;


    public Box(){
        this.clock1 = new Clock(1);
        this.clock2 = new Clock(2);
        this.switchButton1 = new SwitchButton(clock1,1);
        this.switchButton2 = new SwitchButton(clock2,2);
        this.resetButton = new ResetButton(switchButton1,switchButton2);

    }


    public void pressResetButton(){
        clock1.reset();
        clock2.reset();
        resetButton.pressButton();
    }
    public void pressSwitchButton(int id) {
        if(!switchButton1.isDown() && !switchButton2.isDown()){
            if(id == switchButton1.getId()){
                switchButton1.pressButton();
            }else
                switchButton2.pressButton();
        }

        else if(id == switchButton1.getId() && !switchButton1.isDown()){
            switchButton2.unPressButton();
            switchButton1.pressButton();

        }
        else if(id == switchButton2.getId() && !switchButton2.isDown()){
            switchButton1.unPressButton();
            switchButton2.pressButton();

        }
    }


}
