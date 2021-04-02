package com.example.interfaceforproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NamePet extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_name);

        TextView txt = findViewById(R.id.txt);

        EditText etxt = findViewById(R.id.etxt);

        Button go = findViewById(R.id.bt1);
        txt.setText(etxt.getText().toString());
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NamePet.this, MainActivity.class);
                startActivity(i);
            }
        });

        Button quit = findViewById(R.id.bt2);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
