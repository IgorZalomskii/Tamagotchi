package com.example.interfaceforproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class FragmentHall extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_hall);

        Button kitchen = findViewById(R.id.kitchen);
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FragmentHall.this, FragmentKitchen.class);
                startActivity(i);
            }
        });


        Button toilet = findViewById(R.id.toilet);
        toilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FragmentHall.this, FragmentToilet.class);
                startActivity(i);
            }
        });


        Button bedroom = findViewById(R.id.bedroom);
        bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FragmentHall.this, FragmentBedroom.class);
                startActivity(i);
            }
        });

        Button shopFH = findViewById(R.id.shopFH);
        shopFH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FragmentHall.this, ShopFH.class);
                startActivity(i);
            }
        });
//        Button game = findViewById(R.id.game);
//        game.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(FragmentHall.this, FragmentGame.class);
//                startActivity(i);
//
//            }
//        });
    }
}
