//Используя while, вывести в Standard Output первых 10 чисел Фибоначчи.

public class Exercise_3 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int i=0;
        while (i<10){
            if (i<2) {
                array[i]=1;
                System.out.println(array[i]);
            }
            else {
                array[i]=array[i-2]+array[i-1];
                System.out.println(array[i]);
            }
            i++;
        }
    }
}
