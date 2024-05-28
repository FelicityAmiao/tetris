package com.felygame.tetris.poc;

import javax.swing.*;

public class BoxLayoutExample extends JFrame {
  public BoxLayoutExample() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");

    panel.add(button1);
    panel.add(button2);
    panel.add(button3);

    add(panel);

    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new BoxLayoutExample();
  }
}
