package com.felygame.tetris.util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class KeyEventHelper {

  public static final String KEY_DOWN = "DOWN";

  private static final Map<String, BiConsumer<JPanel, Integer>> ACTIONS = new HashMap<>(){{
    put(KEY_DOWN, (objectPanel, speed) -> objectPanel.setLocation(objectPanel.getX(), objectPanel.getY() + speed));
  }};

  public static void bindKeyEvent(JPanel objectPanel, String keyName, final int speed, final Consumer<JPanel> function) {
    objectPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(keyName), keyName);
    objectPanel.getActionMap().put(keyName, new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        ACTIONS.get(keyName).accept(objectPanel, speed);
        if (function != null) {
          function.accept(objectPanel);
        }
      }
    });
  }
}