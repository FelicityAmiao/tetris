package com.felygame.tetris;

import com.felygame.tetris.panel.MainPanel;

import javax.swing.*;
import java.awt.*;

public class Game {

  public static final int WINDOW_WIDTH = 502;
  public static final int WINDOW_HEIGHT = 610;

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(MainPanel.create());
    frame.setVisible(true);
  }

}
