package com.hpyhacking.huarong;

import java.util.*;

public class block {
  private int width, height;
  private point begin_point;

  public block(point begin_point, int width, int height) {
    // init block all point
    for (int i = begin_point.X(); i <= width; i++) {
      for (int j = begin_point.Y(); j <= height; j++) {
        all_point.add(new point(i, j));
      }
    }
  }


  public ArrayList<point> getAllPoints() {
    return all_point;
  }
  

  private ArrayList<point> all_point = new ArrayList<point>();
}
