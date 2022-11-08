package com.rakovets.course.java.core.practice.oop_principles.Cats_home;
//Создать класс Person.
//        Создать Fields:
//        happiness - количество счастья у человека (в процентах)
//        Создать Constructors:
//        Person(happiness) - принимает количество счастья
//        Создать Methods:
//        changeHappiness(percentHappiness) - изменение счастья на percentHappiness (может быть как положительное, так и отрицательное)
//        getHappiness() - получить количество счастья
//        setHappiness(happiness) - задать количество счастья
public class Person {
    private double happiness;

    Person(double happiness){
        this.happiness=happiness;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(double percentHappiness){
        this.happiness=this.happiness+percentHappiness;
    }
}
