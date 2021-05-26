package com.example.interfaceforproject;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.example.interfaceforproject.GameView.screenRatioX;
import static com.example.interfaceforproject.GameView.screenRatioY;

public class Vegetables {
    int x = 0, y, width, height;

    Bitmap veget;

    Vegetables(int screenX, int screenY, Resources resources) {

        veget = BitmapFactory.decodeResource(resources, R.drawable.veg);

        height = (int)(screenY / 3.2);
        width = screenX;

        width = (int)(width * screenRatioX);
        height = (int)(height * screenRatioY);

        y = screenY - (height/2);

        veget = Bitmap.createScaledBitmap(veget, width, height, false);

    }

    public Rect getCollisionShape() {
        return new Rect(x, (int)(y + (height * 0.11f)), x + width, y + height);
    }

}
