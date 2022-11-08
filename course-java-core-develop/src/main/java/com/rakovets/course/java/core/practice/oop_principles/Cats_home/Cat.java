package com.rakovets.course.java.core.practice.oop_principles.Cats_home;
//Создать класс Cat.
//Создать Fields:
//name – кличка кота
//Создать Constructors:
//Cat(name)
//Создать Methods:
//mew() – кот мяукает (т.е возвращает "текст" мяуканья)
//purr() – кот мурлычет (т.е возвращает "текст" мурчания)
//getName() – получить кличку кота
//setName(name) – задать кличку кота

//Перегрузить в классе Cat методы:
//mew(Person) - кот мяукает для User, вызывает у него метод changeHappiness(percentHappiness), где percentHappiness отрицательное число
//purr(Person) - кот мурлычет для User, вызывает у него метод changeHappiness(percentHappiness), где percentHappiness положительное число
public class Cat {
    private String name;
    private double percentHappiness=25.5;
    Cat (String name){
        this.name=name;
    }
    public String mew(){
        return "Mew";
    }
    public String mew(Person person){
        person.changeHappiness(-percentHappiness);
        return mew();
    }
    public String purr(){
        return "Purrrrr";
    }
    public String purr(Person person){
        person.changeHappiness(percentHappiness);
        return purr();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

