package com.felygame.tetris.util;

import com.felygame.tetris.panel.ObjectPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static com.felygame.tetris.panel.ObjectPanel.TOTAL_HEIGHT;

public class DetectHelper {

  public static List<Consumer<JPanel>> detects = Arrays.asList(
      (object -> {
        if (notReachMainPanelBottom(object)) {
          return;
        }
//        gameOver();
      }),
      (object -> {
        if (notReachMainPanelBottom(object)) {
          return;
        }
        sticky(object);
        regenerateControlObject(object);
      })
  );

  private static void regenerateControlObject(JPanel object) {
    Container parent = object.getParent();
    JPanel newObject = ObjectPanel.create();
    parent.add(newObject);
    parent.revalidate();
    parent.repaint();
    System.out.println(object.getLocation());
    System.out.println(newObject.getLocation());
  }

  private static void gameOver() {
    SwingUtilities.invokeLater(() -> {
      JOptionPane.showMessageDialog(null, "You win!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
    });
  }

  private static boolean notReachMainPanelBottom(JPanel object) {
    return object.getLocation().getY() + object.getHeight() <= TOTAL_HEIGHT;
  }

  private static void sticky(JPanel object) {
    KeyEventHelper.unbindKeyEvent(object, KeyEventHelper.KEY_DOWN);
    KeyEventHelper.unbindKeyEvent(object, KeyEventHelper.KEY_LEFT);
    KeyEventHelper.unbindKeyEvent(object, KeyEventHelper.KEY_RIGHT);
    KeyEventHelper.unbindKeyEvent(object, KeyEventHelper.KEY_SPACE);
  }

}
