package com.felygame.tetris.panel;

import javax.swing.*;
import java.awt.*;

public class MainPanel {
  public static JPanel create() {
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createEmptyBorder(50, 100, 50, 100),
        BorderFactory.createLineBorder(new Color(175, 175, 125))
    ));
    mainPanel.add(ObjectPanel.create());
    return mainPanel;
  }

}
