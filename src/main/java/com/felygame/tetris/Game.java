package com.felygame.tetris;

import com.felygame.tetris.com.felygame.tetris.page.MainPage;

import javax.swing.*;
import java.awt.*;

public class Game {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(new Dimension(500, 600));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(MainPage.create());
    frame.setVisible(true);
  }

}
