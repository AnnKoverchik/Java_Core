package com.rakovets.course.java.core.practice.oop_classes_and_objects;
//Создать class Rectangle.

//Создать Fields:
//topLeftPoint - верхняя левая точка
//bottomRightPoint – нижняя правая точка

//Создать Constructors:
//Rectangle(topLeftPoint, bottomRightPoint) – принимает два объекта типа Point

//Создать Methods:
//getTopLeftPoint()
//setTopLeftPoint()
//getBottomRightPoint()
//setBottomRightPoint()
//getPerimeter() – возвращает периметр прямоугольника
//getArea() – возвращает площадь прямоугольника
public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint){
        this.topLeftPoint=topLeftPoint;
        this.bottomRightPoint=bottomRightPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public double getPerimeter(){
        return (Math.abs(topLeftPoint.getX()-bottomRightPoint.getX())+Math.abs(topLeftPoint.getY()-bottomRightPoint.getY()))*2;
    }

    public double getArea(){
        return Math.abs((topLeftPoint.getX()-bottomRightPoint.getX())*(topLeftPoint.getY()-bottomRightPoint.getY()));
    }
}
