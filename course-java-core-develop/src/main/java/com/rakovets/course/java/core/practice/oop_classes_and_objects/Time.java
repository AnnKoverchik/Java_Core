package com.rakovets.course.java.core.practice.oop_classes_and_objects;
//Создать class Time.

//Создать Fields:
//hours
//minutes
//seconds

//Создать Constructors:
//Time(totalSeconds) - принимает общее время в секундах, например: 3661 секунд - это 1 час 1 минута 1 секунда
//Time(hours, minutes, seconds)

//Создать Methods:
//getHours()
//setHours(hours)
//getMinutes()
//setMinutes(minutes)
//getSeconds()
//setSeconds()
//getTotalSeconds() - возвращает общее время в секундах

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int totalSeconds){
        hours=totalSeconds/60/60;
        minutes=totalSeconds/60%60;
        seconds=totalSeconds%60;
    }

    Time(int hours, int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    public int getHours(){
    return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSeconds(int hours, int minutes, int seconds) {
        return hours*3600+minutes*60+seconds;
    }

}
