package com.example.interfaceforproject;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GameActivity extends PersonView {

    private GameView gameView;
    public static TextView textMoney, textScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);


        gameView = new GameView(this, point.x, point.y);
        LinearLayout gameLayout = (LinearLayout) findViewById(R.id.gameLayout);
        textScore = (TextView)findViewById(R.id.textScore);
        textMoney = (TextView)findViewById(R.id.textMoney);
        gameLayout.addView(gameView);

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameActivity.this, Hall.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        gameView.resume();
    }
}