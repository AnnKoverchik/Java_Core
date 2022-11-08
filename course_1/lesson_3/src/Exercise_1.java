//Написать программу, которая в зависимости от значения переменной с номером дня недели, показывает название этого дня (например, 5 – это пятница).
//Решить с использованием switch.


public class Exercise_1 {
    public static void main(String[] args) {
        byte num=1;
        switch (num) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Введено некорректное значение.");
                break;
        }
    }
}
