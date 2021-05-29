package com.example.interfaceforproject;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;


public class Person extends PersonView{

    public int f;
    public int e;
    public int t;
    public int s;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fun = f;
        eat = e;
        toilet = t;
        sleep = s;

        Intent i = new Intent(this, PersonView.class);
        i.putExtra("fun", fun);
        i.putExtra("eat", eat);
        i.putExtra("toilet", toilet);
        i.putExtra("sleep", sleep);
        startActivity(i);
    }
}
