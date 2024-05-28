package com.felygame.tetris.poc;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class RectangleButton extends JButton {
  public RectangleButton(String label) {
    super(label);
    Border line = BorderFactory.createLineBorder(Color.BLACK, 0);
    Border margin = BorderFactory.createEmptyBorder(2, 3, 2, 2);
    Border compound = BorderFactory.createCompoundBorder(line, margin);
    this.setBorder(compound);
    this.setContentAreaFilled(false);
  }
}