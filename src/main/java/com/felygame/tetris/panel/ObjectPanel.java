package com.felygame.tetris.panel;

import com.felygame.tetris.block.Block;
import com.felygame.tetris.util.KeyEventHelper;

import javax.swing.*;
import java.awt.*;

import static com.felygame.tetris.enums.Color.LIGHT_DARK_ORIGIN;
import static com.felygame.tetris.util.DetectHelper.detects;

public class ObjectPanel {

  public static final int TOTAL_HEIGHT = 501;
  public static final int Y_SPEED = 30;
  private static final int X_SPEED = 30;

  public static JPanel create() {
    JPanel objectPanel = new JPanel();
    objectPanel.setLayout(new BoxLayout(objectPanel, BoxLayout.X_AXIS));
    objectPanel.add(Block.create(LIGHT_DARK_ORIGIN));
    objectPanel.add(Box.createRigidArea(new Dimension(Block.WIDTH, Block.HEIGHT)));
    objectPanel.setOpaque(false);
    bindKeyEvents(objectPanel);
    return objectPanel;
  }

  private static void bindKeyEvents(JPanel objectPanel) {
    KeyEventHelper.bindKeyEventTimer(objectPanel, KeyEventHelper.KEY_DOWN, Y_SPEED, detects);
    KeyEventHelper.bindKeyEvent(objectPanel, KeyEventHelper.KEY_LEFT, X_SPEED, detects);
    KeyEventHelper.bindKeyEvent(objectPanel, KeyEventHelper.KEY_RIGHT, X_SPEED, detects);
    KeyEventHelper.bindKeyEvent(objectPanel, KeyEventHelper.KEY_SPACE, TOTAL_HEIGHT, detects);
  }
}