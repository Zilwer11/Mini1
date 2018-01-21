package main.Java.main;

import main.Java.Utils.Box;

import java.awt.event.ActionEvent;

public class Main {


    public static void main(String[] args) {
        initializeProgram();
    }

    private static void initializeProgram() {
        Box box = new Box();
        JFrame frame = new JFrame("Chess clocks");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.pack();
        frame.setVisible(true);

        JButton switchButton1 = new JButton("Switch Button Player 1");
        switchButton1.setSize(50, 25);
        switchButton1.addActionListener((ActionEvent e) -> new Thread(() -> box.pressSwitchButton(1)).start());
        panel.add(switchButton1);

        JButton switchButton2 = new JButton("Switch Button Player 2");
        switchButton2.setSize(50, 25);
        switchButton2.addActionListener(e -> new Thread(() -> box.pressSwitchButton(2)).start());
        panel.add(switchButton2);

        JButton resetButton = new JButton("Reset");
        resetButton.setSize(50, 25);
        resetButton.addActionListener((ActionEvent e) -> new Thread(box::pressResetButton).start());
        panel.add(resetButton);

        frame.add(panel);


    }


}
