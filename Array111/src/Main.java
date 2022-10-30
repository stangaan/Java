import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       //First level: level1:
        //Создайте массив размером 100 символов, заполните все ячейки значением 10. 1 и 99
        // ячейки заполните значениями, равными 0
        //
        //
        //level2:
        //Создайте массив размером 100 символов, заполните все ячейки согласно такому правилу:
        // 1 ячейка - 111, 2ая - 222, 3ая - 333,….  11ая - 111, 12ая - 222, 13ая - 333.
        // Найдите сумму значений всех ячеек
        int[]Array = new int[100];
           for (int a=1; a<99; a++) {
               Array[a] = 10;
           }
    Array[0] =0;
           Array[99] = 0;
        System.out.println(Arrays.toString(Array));
        int[] ArrayLevel = new int[100];
        int c =000;
        for (int b = 0; b<=8; b++){
            c+=111;

            ArrayLevel[b] = c;

        }


        System.out.println(Arrays.toString(ArrayLevel));

    }
    }
