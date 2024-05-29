package com.felygame.tetris.operation.object;

import javax.swing.*;
import java.util.stream.IntStream;

public class RectangleOperationObject extends JPanel {

  public static JPanel create(int row, int col) {
    RectangleOperationObject rectangleOperationObject = new RectangleOperationObject();
    rectangleOperationObject.setLayout(new BoxLayout(rectangleOperationObject, BoxLayout.Y_AXIS));
    IntStream.range(0, row).forEach(i -> rectangleOperationObject.add(createRowPanel(col)));
    return rectangleOperationObject;
  }

  private static JPanel createRowPanel(int col) {
    JPanel rowPanel = new JPanel();
    rowPanel.setLayout(new BoxLayout(rowPanel, BoxLayout.X_AXIS));
    IntStream.range(0, col).mapToObj(i -> BlockOperationObject.create()).forEach(rowPanel::add);
    return rowPanel;
  }
}
