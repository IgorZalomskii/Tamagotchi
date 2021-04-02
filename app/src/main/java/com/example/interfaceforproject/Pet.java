package com.example.interfaceforproject;

import android.os.CountDownTimer;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Pet extends AppCompatActivity {
    private int health;
    private int eat;
    private int sleep;
    private int fun;
    private int toilet;

    public void Start(){
        health = new Random().nextInt(50) + 50;
        eat = new Random().nextInt(40) + 40;
        sleep = new Random().nextInt(70) + 30;
        fun = new Random().nextInt(50) + 20;
        toilet = new Random().nextInt(30) + 20;
    }

    public void CheckDead(){
        if (health == 0 || eat == 0){
            Dead();
        }
    }

    private void Dead() {
        Toast dead = Toast.makeText(getApplicationContext(), "hhh", Toast.LENGTH_LONG);
    }

    public void Eat(){
        eat += 20;
        if (eat > 80){
            onStop();
        }
    }

    public void Toilet(){
        toilet = 100;
    }

    public void Sleep() {
        sleep = 100;
    }

    public void Game(){

    }

    class Time extends CountDownTimer {
        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public Time(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        public Time(){
            super(Integer.MAX_VALUE, 60);

        }

        @Override
        public void onTick(long millisUntilFinished) {
            CheckDead();
        }

        @Override
        public void onFinish() {

        }
    }
}



