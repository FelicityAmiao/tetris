package com.felygame.tetris.poc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SquarePanel extends JPanel {

  public SquarePanel() {
    setBorder(new EmptyBorder(0, 0, 0, 0)); // Set an empty border with no padding
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawRect(1, 1, 48, 48);
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(50, 50); // Return the size of the square
  }

  @Override
  public Dimension getMaximumSize() {
    return getPreferredSize(); // Return the preferred size as the maximum size
  }
}
