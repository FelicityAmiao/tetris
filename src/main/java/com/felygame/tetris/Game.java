package com.felygame.tetris;

import com.felygame.tetris.operation.object.RectangleOperationObject;
import javax.swing.*;

public class Game {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(500, 600);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(RectangleOperationObject.create(1, 1));
    frame.setVisible(true);
  }
}
