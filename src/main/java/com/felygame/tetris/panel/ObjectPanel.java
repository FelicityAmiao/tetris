package com.felygame.tetris.panel;

import com.felygame.tetris.operation.object.RectangleOperationObject;

import javax.swing.*;

public class ObjectPanel {
  public static JPanel create() {
    return RectangleOperationObject.create(1, 1);
  }
}
