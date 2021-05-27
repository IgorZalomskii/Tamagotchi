package com.example.interfaceforproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Person extends AppCompatActivity {
    public int eat;
    public int sleep;
    public int fun;
    public int toilet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Start();
    }

    public void Start(){
        eat = new Random().nextInt(40) + 40;
        sleep = new Random().nextInt(70) + 30;
        fun = new Random().nextInt(50) + 20;
        toilet = new Random().nextInt(30) + 20;

    }

    public void Fun(){
        fun = 100;
    }

    public void Eat() {
        eat = 100;
    }

    public void Sleep(){
        sleep = 100;
    }

    public void  Toilet(){
        toilet = 100;
    }
    public void CheckDead(){
        if (eat == 0 || fun == 0 || toilet == 0){
            Dead();
        }
    }

    private void Dead() {
        Toast dead = Toast.makeText(getApplicationContext(), "hhh", Toast.LENGTH_LONG);
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }



}



