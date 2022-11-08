//Проверить, имеет ли число вещественную часть. Например, число 3.14 – имеют вещественную часть, а число 11.0 – нет.

import java.util.Arrays;

public class Exercise_5 {
    public static void main(String[] args) {
        double n=3.14;
        double ost=n%1;
        if (ost>0)
            System.out.println("Имеет вещественную часть");
        else System.out.println("Не имеет вещественную часть");
    }
}
