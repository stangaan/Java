import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrays = new  int[100];//так пишется массив int [] new int [... ]число массивов
        int [] myArrays = new int[20];
        int [] myTwoArrays = new int[50];
        int [] yearArrays = new int[19];
        System.out.println(Arrays.toString(arrays));
    arrays[1] = 10000;//изминение конкретного массива= [ 1] на что меняем конкретный массив= 10000
    myArrays[2] = 365;
    myTwoArrays[49] =322;


        System.out.println(Arrays.toString(myArrays));//так мы выводим массив в консоль.
        for (int i = 1; i<100; i+=2) {//изменение массива с помощью цикла for//
            arrays[i] = i;//как менять числа в масиве в общем//
        }


        System.out.println(Arrays.toString(arrays));

        System.out.println(Arrays.toString(myTwoArrays));
    }
}