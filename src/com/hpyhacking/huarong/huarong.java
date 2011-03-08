package com.hpyhacking.huarong;

import android.app.Activity;
import android.os.Bundle;

public class huarong extends Activity {
  @Override
    public void onCreate(Bundle savedInstanceState) {
      block[] blocks = new block[] {
        new block(new point(1, 1), 1, 2), // ZhangFei
        new block(new point(2, 1), 2, 2), // CaoCao
        new block(new point(4, 1), 1, 2), // MaChao
        new block(new point(1, 3), 1, 2), // ZhaoYun
        new block(new point(2, 3), 2, 1), // GuanYu
        new block(new point(4, 3), 1, 2), // HuangZhong
        new block(new point(2, 4), 1, 1), // Pawn
        new block(new point(3, 4), 1, 1), // Pawn
        new block(new point(1, 5), 1, 1), // Pawn
        new block(new point(4, 5), 1, 1)  // Pawn
      };

      board game_board = new board(blocks);

      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
    }
}
