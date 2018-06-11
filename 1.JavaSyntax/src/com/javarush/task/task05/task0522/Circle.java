package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
        this.radius = 10;
    }

    public Circle(double radius){
        this.x = 0;
        this.y = 0;
        this.radius = radius;
    }

    public Circle(double left, double top, double weight, double height)
    {
        double min = weight;
        if (weight > height) min = height;
        this.x = left + weight/2;
        this.y = top + height/2;
        this.radius = min/2;
    }

    public Circle(){
        this.x = 0;
        this.y = 0;
        this.radius = 10;
    }

    public static void main(String[] args) {

    }
}