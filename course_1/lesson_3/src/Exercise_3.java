//Написать программу, которая в зависимости от значения переменной,
// содержащей значение текущего часа, показывает приветствие, соответствующее этому часу
// (например, 11 – выводится приветствие "Доброе утро").
//Решить с использованием if-else.

public class Exercise_3 {
    public static void main(String[] args) {
        byte num=24;
        if (num>6 && num<=11)
            System.out.println("Доброе утро");
            else  if (num>11 && num<=17)
                     System.out.println("Добрый день");
                  else  if (num>17 && num<=22)
                            System.out.println("Добрый вечер");
                       else System.out.println("Доброй ночи");

    }
}
