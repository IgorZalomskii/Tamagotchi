package com.example.interfaceforproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;


public class Hall extends PersonView {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_hall);

        Button kitchen = findViewById(R.id.kitchen);
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hall.this, Kitchen.class);
                startActivity(i);
            }
        });


        Button toilet = findViewById(R.id.toilet);
        toilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hall.this, Toilet.class);
                startActivity(i);
            }
        });


        Button bedroom = findViewById(R.id.bedroom);
        bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hall.this, Bedroom.class);
                startActivity(i);
            }
        });

        Button status = findViewById(R.id.state);
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hall.this, PersonView.class);
                startActivity(i);
            }
        });

        Button game = findViewById(R.id.game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = 100;
                Intent i = new Intent(Hall.this, GameActivity.class);
                startActivity(i);
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

