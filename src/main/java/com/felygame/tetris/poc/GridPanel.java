package com.felygame.tetris.poc;

import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {
  public GridPanel() {
    this.setLayout(new GridLayout(2, 3)); // Set layout to GridLayout with 2 rows and 3 columns

    for (int i = 1; i <= 6; i++) {
      this.add(new JButton("Button " + i)); // Add a new JButton to the JPanel
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new GridPanel());
    frame.setVisible(true);
  }
}
