package com.felygame.tetris.com.felygame.tetris.page;

import com.felygame.tetris.operation.object.RectangleOperationObject;

import javax.swing.*;
import java.awt.*;

public class MainPage {
  public static JPanel create() {
    JPanel mainPage = new JPanel();
    mainPage.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createEmptyBorder(50, 100, 50, 100),
        BorderFactory.createLineBorder(Color.RED)
    ));
    mainPage.add(RectangleOperationObject.create(1, 1));
    return mainPage;
  }
}
