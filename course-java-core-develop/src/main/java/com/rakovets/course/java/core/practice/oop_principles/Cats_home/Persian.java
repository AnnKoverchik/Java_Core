package com.rakovets.course.java.core.practice.oop_principles.Cats_home;
//Создать классы Siamese, Persian, Sphynx наследуемые от класса Cat.
//Переопределить в них methods:
//mew() – кот мяукает (каждый по разному)
//purr() – кот мурлычет (каждый по разному)
public class Persian extends Cat{

    private final double percentHappiness=8;

    Persian(String name) {
        super(name);
    }
    @Override
    public String mew(){
        return "Mew-w-w";
    }

    @Override
    public String mew(Person person){
        person.changeHappiness(-percentHappiness);
        return mew();
    }
    @Override
    public String purr(){
        return "Pu-u-u-rr";
    }

    @Override
    public String purr(Person person){
        person.changeHappiness(percentHappiness);
        return mew();
    }
}
