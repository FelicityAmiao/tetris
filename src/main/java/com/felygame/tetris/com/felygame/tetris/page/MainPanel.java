package com.felygame.tetris.com.felygame.tetris.page;

import com.felygame.tetris.operation.object.RectangleOperationObject;

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
    mainPanel.add(RectangleOperationObject.create(1, 1));
    mainPanel.add(Box.createVerticalGlue());
    mainPanel.add(RectangleOperationObject.create(1, 10));
    return mainPanel;
  }
}
