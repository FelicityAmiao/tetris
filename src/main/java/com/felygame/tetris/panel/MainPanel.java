package com.felygame.tetris.panel;

import javax.swing.*;
import java.awt.*;

public class MainPanel {
  public static JPanel create() {
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createEmptyBorder(50, 100, 50, 100),
        BorderFactory.createLineBorder(Color.RED)
    ));
    mainPanel.add(ObjectPanel.create());
    mainPanel.add(Box.createVerticalGlue());
    mainPanel.add(ContainerPanel.create());
    return mainPanel;
  }

}
