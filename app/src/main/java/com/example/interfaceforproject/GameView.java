package com.example.interfaceforproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import android.os.Build;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Random;

public class GameView extends SurfaceView implements Runnable {

    private Thread thread;
    private boolean isPlaying, onTouch = false, isGameOver = false;
    public int score = 0, money = 0;
    public static int screenX, screenY;
    private static final int asteroidCount = 0;
    public static float screenRatioX, screenRatioY;
    private Paint paint;
    private SharedPreferences prefs;
    private Random random;
    private final Vegetables vegetables;
    private ArrayList<Knife> knifes = new ArrayList<>();
    private  int KNIFE_INTERVAL = 50;
    private GameActivity activity;
    private int currentTime = 0;

    public GameView(GameActivity activity, int screenX, int screenY){
        super(activity);


        this.activity = activity;

        prefs = activity.getSharedPreferences("game", Context.MODE_PRIVATE);

        this.screenX = screenX;
        this.screenY = screenY;
        screenRatioX = screenX  / 1080f;
        screenRatioY = screenY  / 1920f;


        vegetables = new Vegetables(screenX, screenY, getResources());

        knifes = new ArrayList<>();

        random = new Random();


    }

    @Override
    public void run(){
        while(isPlaying){


            update();
            draw();
            newKnife();
            sleep();
        }
    }


    private void update(){

        for (Knife knife : knifes) {
            if(score > 20){
                knife.speed=16;
                KNIFE_INTERVAL = 35;
            }
            if(score > 40){
                knife.speed=17;
                KNIFE_INTERVAL = 30;
            }
            if(score > 80){
                knife.speed=18;
                KNIFE_INTERVAL = 25;
            }
            if(score > 160){
                knife.speed=19;
                KNIFE_INTERVAL = 15;
            }
            if(score > 200){
                knife.speed=30;
                KNIFE_INTERVAL = 5;
            }
            knife.y += knife.speed;
            if(Rect.intersects(knife.getCollisionShape(), vegetables.getCollisionShape())){
                isGameOver = true;
                return;
            }
        }
    }


    private void draw(){

        if(getHolder().getSurface().isValid()){

            Canvas canvas = getHolder().lockCanvas();

            Paint bg = new Paint();
            bg.setColor(Color.GREEN);
            canvas.drawPaint(bg);

            for(Knife knife : knifes){
                canvas.drawBitmap(knife.knife, knife.x, knife.y, paint);
            }

            canvas.drawBitmap(vegetables.veget, vegetables.x, vegetables.y, paint);

            if(isGameOver){
                isPlaying = false;
                getHolder().unlockCanvasAndPost(canvas);
                waitBeforeExiting();
                return;
            }

            getHolder().unlockCanvasAndPost(canvas);

        }


    }

    private void waitBeforeExiting() {
        try {
            Thread.sleep(3000);
            activity.startActivity(new Intent(activity, FragmentHall.class));
            activity.finish();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    private void sleep () {
        try {
            Thread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resume () {

        isPlaying = true;
        thread = new Thread(this);
        thread.start();

    }

    public void pause () {

        try {
            isPlaying = false;
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void newKnife(){
        if(currentTime >= KNIFE_INTERVAL){
            Knife knife = new Knife(getResources());
            knifes.add(knife);
            currentTime = 0;
        }else{
            currentTime ++;
        }
    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {
        for (int i = knifes.size()-1; i >= 0; i--)
        {
            Knife knife = knifes.get(i);
            if (knife.isCollision(event.getX(),event.getY())) {
                knifes.remove(knife);
                score++;
                money+=5;
                GameActivity.textMoney.setText("Money:" + money + "$");
                GameActivity.textScore.setText("Score:" + score);
            }
        }
        return super.onTouchEvent(event);
    }
}