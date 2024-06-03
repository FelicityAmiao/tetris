package com.felygame.tetris.util;

import javax.swing.*;
import java.util.function.Consumer;

import static com.felygame.tetris.panel.ObjectPanel.TOTAL_HEIGHT;

public class DetectHelper {

  private static final Consumer<JPanel> detectReachContainer = (jpanel -> {
    if (notReachMainPanelBottom(jpanel)) {
      return;
    }
    gameOver();
  });

  private static Consumer<JPanel> detectSticky = (jpanel -> {
    if (notReachMainPanelBottom(jpanel)) {
      return;
    }
    sticky(jpanel);
  });

  public static Consumer[] detects = new Consumer[]{
      detectReachContainer,
      detectSticky
  };

  private static void gameOver() {
    SwingUtilities.invokeLater(() -> {
      JOptionPane.showMessageDialog(null, "You win!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
    });
  }

  private static boolean notReachMainPanelBottom(JPanel jpanel) {
    return jpanel.getLocation().getY() + jpanel.getHeight() <= TOTAL_HEIGHT;
  }

  private static void sticky(JPanel jpanel) {
    KeyEventHelper.unbindKeyEvent(jpanel, KeyEventHelper.KEY_DOWN);
    KeyEventHelper.unbindKeyEvent(jpanel, KeyEventHelper.KEY_LEFT);
    KeyEventHelper.unbindKeyEvent(jpanel, KeyEventHelper.KEY_RIGHT);
    KeyEventHelper.unbindKeyEvent(jpanel, KeyEventHelper.KEY_SPACE);
  }

}
