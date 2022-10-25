import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws InterruptedException {
        int [] array = new int[10];//int [] -массив, array-название массива,
        // new int [10]-количество чисел в массиве
        for (int i =5; i<10; i++) {//работа с числами в массиве лучше делать с циклом for//
            array[i] = 5+i;//это это цикл с массивом
        }
        System.out.println(Arrays.toString(array));//так выводиться массив//


        }
    }



