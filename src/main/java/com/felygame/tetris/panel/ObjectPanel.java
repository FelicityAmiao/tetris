package com.felygame.tetris.panel;

import com.felygame.tetris.block.Block;
import com.felygame.tetris.util.KeyEventHelper;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

import static com.felygame.tetris.enums.Color.LIGHT_DARK_ORIGIN;

public class ObjectPanel {

  public static final int Y_SPEED = 30;
  private static final int X_SPEED = 30;

  private static final Consumer<JPanel> detectReachContainer = (jpanel -> {
    Container parent = jpanel.getParent();
    if (parent == null) {
      return;
    }
    Component containerPanel = parent.getComponent(parent.getComponentCount() - 1);
    if (!(containerPanel instanceof JPanel)) {
      return;
    }
    Point containerLocation = containerPanel.getLocation();
    Point objectLocation = jpanel.getLocation();
    if (!containerLocation.equals(objectLocation)) {
      return;
    }
    SwingUtilities.invokeLater(() -> {
      JOptionPane.showMessageDialog(null, "You win!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
    });
  });

  public static JPanel create() {
    JPanel objectPanel = new JPanel();
    objectPanel.setLayout(new BoxLayout(objectPanel, BoxLayout.X_AXIS));
    objectPanel.add(getObject());
    objectPanel.add(Box.createRigidArea(new Dimension(Block.WIDTH,  Block.HEIGHT)));
    objectPanel.setOpaque(false);
    KeyEventHelper.bindKeyEvent(objectPanel, KeyEventHelper.KEY_DOWN, Y_SPEED, detectReachContainer);
    KeyEventHelper.bindKeyEvent(objectPanel, KeyEventHelper.KEY_LEFT, X_SPEED, null);
    return objectPanel;
  }

  private static JPanel getObject() {
    return Block.create(LIGHT_DARK_ORIGIN);
  }

}