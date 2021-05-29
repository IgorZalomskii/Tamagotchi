package com.example.interfaceforproject;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import java.util.Random;


public class Person extends PersonView{

    public final int fun;
    public final int eat;
    public final int toilet;
    public final int sleep;

    Random r = new Random();

    public Person(int fun, int eat, int toilet, int sleep) {
        this.eat = r.nextInt(100);
        this.toilet = r.nextInt(100);
        this.sleep = r.nextInt(100);
        this.fun = r.nextInt(100);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(this, PersonView.class);
        i.putExtra("fun", fun);
        i.putExtra("eat", eat);
        i.putExtra("toilet", toilet);
        i.putExtra("sleep", sleep);
        startActivity(i);
    }
}
