package com.felygame.tetris.operation.object;

import javax.swing.*;
import java.awt.*;

public class BlockOperationObject extends JPanel {
  public static JPanel create() {
    return new BlockOperationObject();
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
