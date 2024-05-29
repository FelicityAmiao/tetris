package com.felygame.tetris.poc;

import com.felygame.tetris.block.GridBlock;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;

public class ContainerPanel$GetPanelLocation {
  public static JPanel create() {
    JPanel container = GridBlock.create(1, 1);
    container.addAncestorListener(new AncestorListener() {
      @Override
      public void ancestorAdded(AncestorEvent event) {
        Point containerLocation = container.getLocation();
        System.out.println("Container location in parent panel: " + containerLocation);
      }

      @Override
      public void ancestorRemoved(AncestorEvent event) {
      }

      @Override
      public void ancestorMoved(AncestorEvent event) {
      }
    });
    return container;
  }
}