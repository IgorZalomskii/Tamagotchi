package com.example.interfaceforproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Person extends Activity{

    public int eat;
    public int sleep;
    public int fun;
    public int toilet ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person);
        fun = new Random().nextInt(100);
        eat = new Random().nextInt(100);
        toilet = new Random().nextInt(100);
        sleep = new Random().nextInt(100);

        final TextView funText = (TextView) findViewById(R.id.funstat);
        final TextView eatText = (TextView) findViewById(R.id.eatstat);
        final TextView toiletText = (TextView) findViewById(R.id.toiletstat);
        final TextView sleepText = (TextView) findViewById(R.id.sleepstat);

        Timer timer = new Timer();
        long delay = 0;
        long period = 2000;

        long secPeriod = 4000;

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Person.this, Hall.class);
                startActivity(i);
            }
        });

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                fun = fun - 1;
                eat = eat - 1;


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        funText.setText("" + fun);
                        eatText.setText("" + eat);
                    }
                });
            }
        },delay, period);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                toilet = toilet - 1;
                sleep = sleep - 1;

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        toiletText.setText("" + toilet);
                        sleepText.setText("" + sleep);
                    }
                });
            }
        }, delay, secPeriod);


        CheckDead();
    }

    public void CheckDead(){
        if (eat == 0 || fun == 0 || toilet == 0){
//            Intent i = new Intent(this,)
        }
    }

}

