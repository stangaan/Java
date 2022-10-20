import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int name =0;
        long start = System.currentTimeMillis();

        for (int i = 0; i <=number ; i+=2) {
            name++;
            System.out.println("Пожалуйста Вам четные числа - " + i +" м количество чисел - " + name);
        }

        System.out.println("Выполненно!");

        for (int m = 2; m <number; m+=10) {
            System.out.println(m);
        }
                System.out.println("Выполненно!");


        for (int m = 0; m<number; m++) {
            System.out.println(m + "6");

    }        long finish = System.currentTimeMillis();

        System.out.println("Выполненно!" + finish);

    }}