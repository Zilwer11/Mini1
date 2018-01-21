package main.Java.Button;

public class ResetButton implements PressableButton{
    private SwitchButton switchButton1;
    private SwitchButton switchButton2;

    public ResetButton(SwitchButton swb1,SwitchButton swb2){
        this.switchButton1 = swb1;
        this.switchButton2 = swb2;
    }


    @Override
    public void pressButton() {
        System.out.println();
        System.out.println("Reset button was pressed");
        switchButton1.unPressButton();
        switchButton2.unPressButton();
    }
}
