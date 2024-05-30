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
    put(KEY_DOWN, (jPanel, speed) -> jPanel.setLocation(jPanel.getX(), jPanel.getY() + speed));
  }};

  public static void bindKeyEvent(JPanel jPanel, String keyName, final int speed, final Consumer<JPanel> function) {
    jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(keyName), keyName);
    jPanel.getActionMap().put(keyName, new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        ACTIONS.get(keyName).accept(jPanel, speed);
        if (function != null) {
          function.accept(jPanel);
        }
      }
    });
  }
}