package com.example.interfaceforproject;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import java.util.Random;

import static com.example.interfaceforproject.GameView.screenRatioX;
import static com.example.interfaceforproject.GameView.screenRatioY;
import static com.example.interfaceforproject.GameView.screenX;

public class Knife {

    public int speed = 15;

    int y = 0, x, width, height;
    Bitmap knife;

    Knife(Resources res) {
        Random random = new Random();
        knife = BitmapFactory.decodeResource(res, R.drawable.knife);

        width = knife.getWidth();
        height = knife.getHeight();

        width /= 2;
        height /= 2;

        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        knife = Bitmap.createScaledBitmap(knife, width, height, false);

        x = random.nextInt(screenX - height);
    }

    Rect getCollisionShape() {
        return new Rect(x, y, x + width, y + height);
    }


    public boolean isCollision(float x2, float y2) {
        return x2 > x && x2 < x + width && y2 > y && y2 < y + height;
    }
}
