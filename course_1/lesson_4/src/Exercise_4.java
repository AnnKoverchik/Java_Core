//Вывести таблицу умножения чисел от 1 до 10 (используя while внутри while).

public class Exercise_4 {
    public static void main(String[] args) {
        int [][] array =new int[11][11];
        int i=1;
        int k=1;
        while (i<11){
            while (k<11){
                array[i][k]=i*k;
                System.out.println(i+"*"+k+"="+array[i][k]);
                k++;
            }
            k=1;
            i++;
        }
    }
}
