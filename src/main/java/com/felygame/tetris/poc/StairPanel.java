package com.felygame.tetris.poc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class StairPanel extends JPanel {
    public StairPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Set layout to BoxLayout with Y_AXIS

        for (int i = 1; i <= 2; i++) {
            JPanel stepPanel = new JPanel();
            stepPanel.setLayout(new BoxLayout(stepPanel, BoxLayout.X_AXIS)); // Set layout to BoxLayout with X_AXIS
            stepPanel.setBorder(new EmptyBorder(0, 0, 0, 0)); // Set an empty border with no padding

            stepPanel.setAlignmentX(LEFT_ALIGNMENT);

            for (int j = 0; j < i; j++) {
                stepPanel.add(new SquarePanel()); // Add a new RectangleButton to the stepPanel
            }

            this.add(stepPanel); // Add the stepPanel to the main panel
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new StairPanel());
        frame.setVisible(true);
    }
}
