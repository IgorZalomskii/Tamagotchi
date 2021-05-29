package com.example.interfaceforproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Toilet extends PersonView {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_toilet);

        Button hall = findViewById(R.id.hall);
        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Toilet.this, Hall.class);
                startActivity(i);
            }
        });

        Button kitchen = findViewById(R.id.kitchen);
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Toilet.this, Kitchen.class);
                startActivity(i);
            }
        });

        Button bedroom = findViewById(R.id.bedroom);
        bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Toilet.this, Bedroom.class);
                startActivity(i);
            }
        });

        Button status = findViewById(R.id.state);
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Toilet.this, PersonView.class);
                startActivity(i);
            }
        });

        Button goToToilet = findViewById(R.id.gototuilet);
        goToToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Нужда устранена", Toast.LENGTH_SHORT).show();
                t = 100;
            }
        });

        ImageView imageView = findViewById(R.id.PersView);

        imageView.setBackgroundResource(R.drawable.animation);

        final AnimationDrawable animation = (AnimationDrawable) imageView.getBackground();

        Button hands = findViewById(R.id.hands);
        hands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (animation.isRunning()){
                    animation.stop();
                }
                else {
                    animation.start();
                }
            }
        });
    }
}