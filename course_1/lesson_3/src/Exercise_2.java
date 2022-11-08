//Написать программу, которая в зависимости от значения переменной с номером дня недели, показывает название этого дня (например, 6 – это суббота).
//Решить с использованием if-else.

public class Exercise_2 {
    public static void main(String[] args) {
        byte num=10;
        if (num==1)
            System.out.println("Понедельник");
        else  if (num==2)
                 System.out.println("Вторник");
              else  if (num==3)
                       System.out.println("Среда");
                    else  if (num==4)
                             System.out.println("Четверг");
                          else  if (num==5)
                                   System.out.println("Пятница");
                                else  if (num==6)
                                         System.out.println("Суббота");
                                      else  if (num==7)
                                               System.out.println("Воскресенье");
                                            else System.out.println("Введено некорректное значение.");
        }
    }
