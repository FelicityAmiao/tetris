package com.felygame.tetris.util;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static com.felygame.tetris.panel.ObjectPanel.TOTAL_HEIGHT;

public class DetectHelper {

  public static List<Consumer<JPanel>> detects = Arrays.asList(
      (jpanel -> {
        if (notReachMainPanelBottom(jpanel)) {
          return;
        }
        gameOver();
      }),
      (jpanel -> {
        if (notReachMainPanelBottom(jpanel)) {
          return;
        }
        sticky(jpanel);
      })
  );

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
