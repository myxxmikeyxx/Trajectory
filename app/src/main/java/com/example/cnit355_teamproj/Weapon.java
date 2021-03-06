package com.example.cnit355_teamproj;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Weapon {

    private GameView context;
    private Bitmap image;
    private int x;
    private int y;
    private int width;
    private int height;


    public Weapon(GameView ctx, Bitmap bmp) {
        this.context = ctx;
        this.image = bmp;
        this.width = image.getWidth();
        this.height = image.getHeight();
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

    public void update() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
