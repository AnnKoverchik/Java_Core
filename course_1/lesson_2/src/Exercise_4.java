//В переменной n хранится целое трехзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

public class Exercise_4 {
    public static void main(String[] args) {
        int n=218;
        int s=0;
        for (int i=1;i<=3 ;i++){
            s=s+n%10;
            n=n/10;
        }
        System.out.println("Сумма цифр числа равна: "+s);
    }
}
