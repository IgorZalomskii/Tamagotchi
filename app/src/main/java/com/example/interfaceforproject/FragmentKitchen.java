package com.example.interfaceforproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FragmentKitchen extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_kitchen);

        Button hall = findViewById(R.id.hall);
        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FragmentKitchen.this, FragmentHall.class);
                startActivity(i);
            }
        });

        Button toilet = findViewById(R.id.toilet);
        toilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FragmentKitchen.this, FragmentToilet.class);
                startActivity(i);
            }
        });

        Button bedroom = findViewById(R.id.bedroom);
        bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FragmentKitchen.this, FragmentBedroom.class);
                startActivity(i);
            }
        });

        Button shopFK = findViewById(R.id.shopFK);
        shopFK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FragmentKitchen.this, ShopFK.class);
                startActivity(i);
            }
        });
    }
}
