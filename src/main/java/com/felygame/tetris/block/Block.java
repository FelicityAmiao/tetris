package com.felygame.tetris.block;

import javax.swing.*;
import java.awt.*;

public class Block extends JPanel {

  public static final int WIDTH = 30;
  public static final int HEIGHT = 30;

  public static JPanel create() {
    return new Block();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawRect(0, 0, WIDTH, HEIGHT);
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(WIDTH, HEIGHT);
  }

  @Override
  public Dimension getMaximumSize() {
    return getPreferredSize();
  }
}
