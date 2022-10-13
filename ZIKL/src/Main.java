import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Вывести все числа от 0 до 10000, которые заканчиваются на 7
        int a =1;
        while  (a <=100) {
            sleep(2000);
        int b = a*5;
            System.out.print( a + "*" + "5 = ");
            Scanner scanner = new Scanner(System.in);
                    int c = scanner.nextInt();
                    if (c == b) {
                System.out.println("Правильно");

            }
                    else {
                System.out.println("Не правильно");
            }
            sleep(5000);
            System.out.println(b);
            a++ ;
        }


       // int a = 0;
        //while (a < 10000) //

    }

}