package com.felygame.tetris.operation.object;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BlockOperationObject extends JPanel {
  public static JPanel create() {
    JPanel blockOperationObject = new BlockOperationObject();
    blockOperationObject.setBorder(new EmptyBorder(0, 0, 0, 0));
    return blockOperationObject;
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
