package com.example.interfaceforproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PersonView extends AppCompatActivity {

    public int eat = 50;
    public int sleep = 50;
    public int fun = 50;
    public int toilet = 50;
    public int textMoney;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person);

        Bundle arg = getIntent().getExtras();

        TextView nameView = findViewById(R.id.nameT);
        String name = arg.get("name").toString();
        nameView.setText(name);


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
                Intent i = new Intent(PersonView.this, Hall.class);
                startActivity(i);
            }
        });

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                fun--;
                eat--;

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
                toilet--;
                sleep--;

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
        Dead();
    }

    public void CheckDead(){
        if (eat < 10 || fun < 10 || toilet < 10 || sleep < 10){
            Toast.makeText(getApplicationContext(), "Критические показатели", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, PersonView.class);
            startActivity(i);
        }
    }

    public void Dead(){
        if (eat == 0 || fun == 0 || toilet == 0 || sleep == 0){
            Toast.makeText(getApplicationContext(), "Жизненные показатели на 0. Вы проиграли", Toast.LENGTH_LONG).show();
        }

        if (eat < 0 || fun < 0 || toilet < 0 || sleep < 0){
            finishAffinity();
        }
    }

}

