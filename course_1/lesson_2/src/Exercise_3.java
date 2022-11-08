//Подсчитать площадь и длину окружности для круга с радиусом r. Радиус должен быть задан переменной в программе. Вывести результат в консоль.

public class Exercise_3 {
    public static void main(String[] args) {
        int r=8;
        final double PI=3.14;
        double l=2*r*PI;
        double s=PI*r*r;
        System.out.println("Длина окружности равна: "+l);
        System.out.println("Площать круга равна: "+s);
    }
}
