package com.felygame.tetris.block;

import javax.swing.*;
import java.util.stream.IntStream;

public class GridBlock extends JPanel {

  public static JPanel create(int row, int col) {
    GridBlock gridBlock = new GridBlock();
    gridBlock.setLayout(new BoxLayout(gridBlock, BoxLayout.Y_AXIS));
    IntStream.range(0, row).forEach(i -> gridBlock.add(createRowPanel(col)));
    return gridBlock;
  }

  private static JPanel createRowPanel(int col) {
    JPanel rowPanel = new JPanel();
    rowPanel.setLayout(new BoxLayout(rowPanel, BoxLayout.X_AXIS));
    IntStream.range(0, col).mapToObj(i -> Block.create()).forEach(rowPanel::add);
    return rowPanel;
  }
}
