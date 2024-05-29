package com.felygame.tetris.panel;

import com.felygame.tetris.block.GridBlock;

import javax.swing.*;

public class ObjectPanel {
  public static JPanel create() {
    return GridBlock.create(1, 1);
  }
}
