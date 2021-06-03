package com.example.interfaceforproject;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;


public class Person{

    public int fun;
    public int eat;
    public int toilet;
    public int sleep;

    Random r = new Random();

    public Person() {
        this.eat = r.nextInt(100);
        this.toilet = r.nextInt(100);
        this.sleep = r.nextInt(100);
        this.fun = r.nextInt(100);
    }
}
