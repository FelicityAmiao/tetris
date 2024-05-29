package com.felygame.tetris.block;

import javax.swing.*;
import java.awt.*;

public class Block extends JPanel {
  public static JPanel create() {
    return new Block();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawRect(0, 0, 30, 30);
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(30, 30);
  }

  @Override
  public Dimension getMaximumSize() {
    return getPreferredSize();
  }
}
