//Вывести в Standard Output числа от 10 до 0

public class Exercise_2 {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        for (int i=10; i<=array.length;i--) {
            System.out.println(array[i]);
        }
    }
}
