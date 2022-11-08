//Написать программу, которая в зависимости от значения переменной,
// содержащей значение текущего часа, показывает приветствие,
// соответствующее этому часу (например, 11 – выводится приветствие "Доброе утро").
//Решить с использованием switch.

public class Exercise_4 {
    public static void main(String[] args) {
        byte num=15;
        switch (num) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Доброе утро");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Добрый день");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                System.out.println("Добрый вечер");
                break;
            case 23:
            case 24:
            case 01:
            case 02:
            case 03:
            case 04:
            case 05:
                System.out.println("Доброй ночи");
                break;
            default:
                System.out.println("Введено некорректное значение.");
                break;
        }
    }
}
