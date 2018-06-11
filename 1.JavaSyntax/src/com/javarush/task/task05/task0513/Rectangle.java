package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize(int width, int height){
        this.top = 0;
        this.left = 0;
        this.width = width;
        this.height = height;
    }
    public void initialize(Rectangle rect, int top, int left){
        this.top = top;
        this.left = left;
        this.width = rect.width;
        this.height = rect.height;
    }

    public static void main(String[] args) {

    }
}
