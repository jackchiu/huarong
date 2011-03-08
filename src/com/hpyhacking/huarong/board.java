package com.hpyhacking.huarong;

import java.util.*;

public class board {
  private final int MAP_WIDTH = 4;
  private final int MAP_HEIGHT = 5;
  private block[][] map = new block[MAP_WIDTH][MAP_HEIGHT];

  public board(block[] blocks) {
    for (int i = 0; i < blocks.length; i ++) {
      ArrayList<point> points = blocks[i].getAllPoints();
      for (int j = 0; j < points.size(); j++)
        map[points.get(j).X()][points.get(j).Y()] = blocks[i];
    }
  }

  private void clear() {
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        map[i][j] = null;
      }
    }
  }
}
