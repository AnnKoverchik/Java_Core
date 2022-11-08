package com.rakovets.course.java.core.practice.oop_classes_and_objects;
//Создать class Point, описывающей точку в декартовой системе координат.

//Создать Fields:
//x - координата точки по оси Ox
//y - координата точки по оси Oy

//Создать Constructors:
//Point(x, y) – принимает координаты x и y

//Создать Methods:
//getX()
//setX()
//getY()
//setY()
//getDistance(point) – принимает объект типа Point, возвращает расстояние от текущей точки (экземпляра, для которого был вызван), до принимаемой точки

public class Point {
    private double x;
    private double y;

    Point(double x, double y){
       this.x=x;
       this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y=y;
    }

    public double getDistance(Point point){
      return Math.sqrt(Math.pow(point.getX()-this.x,2)+ Math.pow(point.getY()-this.y,2));
    }
}
