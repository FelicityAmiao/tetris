package com.felygame.tetris.block;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static javax.swing.BoxLayout.X_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GridBlockTest {

  @Test
  public void should_return_one_panel_with_3_subPanel_when_call_create_given_row_1_col_3() {
    int row = 1;
    int col = 3;

    JPanel result = GridBlock.create(row, col);

    assertEquals(1, result.getComponentCount());
    assertEquals(3, ((JPanel) result.getComponent(0)).getComponentCount());
  }

  @Test
  public void should_return_one_panel_with_Y_axis_3_subPanel_X_axis_when_call_create_given_row_1_col_3() {
    int row = 1;
    int col = 3;

    JPanel result = GridBlock.create(row, col);

    assertEquals(Y_AXIS, ((BoxLayout) result.getLayout()).getAxis());
    JPanel resultRow = (JPanel) result.getComponent(0);
    assertEquals(X_AXIS, ((BoxLayout) resultRow.getLayout()).getAxis());
  }

}