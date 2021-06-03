package com.example.interfaceforproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextStr;
    Button btnSave, btnLoad, go;
    SharedPreferences sharedPreferences;
    public static Person person;

    final String SAVED_TEXT = "TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextStr = (EditText) findViewById(R.id.editTextStr);

        btnSave = (Button) findViewById(R.id.save);
        btnSave.setOnClickListener((View.OnClickListener) this);

        btnLoad = (Button) findViewById(R.id.load);
        btnLoad.setOnClickListener((View.OnClickListener) this);

        go = (Button) findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                person = new Person();
                Intent i = new Intent(MainActivity.this, Hall.class);
                startActivity(i);
            }
        });

        loadData();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:
                saveData();
                break;
            case R.id.load:
                loadData();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveData();
    }

    void saveData() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SAVED_TEXT, editTextStr.getText().toString());
        editor.commit();
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    void loadData() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        String savedText = sharedPreferences.getString(SAVED_TEXT, "");
        editTextStr.setText(savedText);
    }
}