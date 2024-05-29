package com.felygame.tetris.panel;

import com.felygame.tetris.block.Block;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ObjectPanel {

  public static final int Y_SPEED = 30;

  public static JPanel create() {
    JPanel objectPanel = Block.create();
    objectPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("DOWN"), "moveDown");
    objectPanel.getActionMap().put("moveDown", getAction(objectPanel));
    return objectPanel;
  }

  private static AbstractAction getAction(JPanel objectPanel) {
    return new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        moveDown();
        detectReachContainer();
      }

      private void detectReachContainer() {
        Container parent = objectPanel.getParent();
        if (parent == null) {
          return;
        }
        Component containerPanel = getContainerPanel(parent);
        if (!(containerPanel instanceof JPanel)) {
          return;
        }
        Point containerLocation = containerPanel.getLocation();
        Point objectLocation = objectPanel.getLocation();
        if (!containerLocation.equals(objectLocation)) {
          return;
        }
        SwingUtilities.invokeLater(() -> {
          JOptionPane.showMessageDialog(null, "You win!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        });
      }

      private void moveDown() {
        objectPanel.setLocation(objectPanel.getX(), objectPanel.getY() + Y_SPEED);
      }

      private Component getContainerPanel(Container parent) {
        return parent.getComponent(parent.getComponentCount() - 1);
      }
    };
  }
}