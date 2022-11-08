package com.rakovets.course.java.core.practice.oop_principles.Cats_home;
//Создать классы Siamese, Persian, Sphynx наследуемые от класса Cat.
//Переопределить в них methods:
//mew() – кот мяукает (каждый по разному)
//purr() – кот мурлычет (каждый по разному)

//Переопределить в классах Siamese, Persian, Sphynx методы:
//mew(Person) - каждый кот по разному воздействует на счастье человека мяуканьем
//purr(Person) - каждый кот по разному воздействует на счастье человека когда мурлыкает
public class Siamese extends Cat {
    private final double percentHappiness=13;
    Siamese(String name) {
        super(name);
    }

    @Override
    public String mew(){
        return "Mewwww";
    }

    @Override
    public String mew(Person person){
        person.changeHappiness(-percentHappiness);
        return mew();
    }

    @Override
    public String purr(){
        return "Purr";
    }

    @Override
    public String purr(Person person){
        person.changeHappiness(percentHappiness);
        return mew();
    }
}
