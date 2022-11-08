//Есть прямоугольник, у которого известна ширина w и высота h. Высота и ширина прямоугольника должны задаваться переменными в программе. Найти и вывести в консоль:
//периметр прямоугольника
//площадь прямоугольника

import java.util.Arrays;

public class Exercise_2 {
    public static void main(String[] args) {
        int w=65;
        int h=89;
        int p=(w+h)*2;
        int s=w*h;
        System.out.println("Периметр прямоугольника равен: "+p);
        System.out.println("Площать прямоугольника равна: "+s);
    }

}
