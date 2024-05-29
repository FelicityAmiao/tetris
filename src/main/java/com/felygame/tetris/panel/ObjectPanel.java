package com.felygame.tetris.panel;

import com.felygame.tetris.block.Block;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ObjectPanel {

  public static final int Y_SPEED = 30;

  public static JPanel create() {
    JPanel objectPanel = Block.create();
    objectPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("DOWN"), "moveDown");
    objectPanel.getActionMap().put("moveDown", new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        objectPanel.setLocation(objectPanel.getX(), objectPanel.getY() + Y_SPEED);
      }
    });
    return objectPanel;
  }
}
