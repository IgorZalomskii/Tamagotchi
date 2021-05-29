package com.example.interfaceforproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Bedroom extends PersonView {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_bedroom);

        Button kitchen = findViewById(R.id.kitchen);
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Bedroom.this, Kitchen.class);
                startActivity(i);
            }
        });

        Button toilet = findViewById(R.id.toilet);
        toilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Bedroom.this, Toilet.class);
                startActivity(i);
            }
        });

        Button hall = findViewById(R.id.hall);
        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Bedroom.this, Hall.class);
                startActivity(i);
            }
        });

        Button status = findViewById(R.id.state);
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Bedroom.this, PersonView.class);
                startActivity(i);
            }
        });

        Button bed = findViewById(R.id.bed);
        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = 100;
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
