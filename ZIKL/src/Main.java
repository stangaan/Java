import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите пожалуйста после знака = ваш ответ");
        int number= 1;
        int points = 5; //пункты за правильный ответ//
        while (number <= 100) {
            sleep(2000);
            int levels = number * 5; //ввидите математический знак + - * / и любое число с которым вы хотите тренироваться//
            System.out.print(number + " * 5 = ");//измените значения со знаком и числом//
            int c = scanner.nextInt();
            if (c == levels) {
                System.out.print("Правильно вы получаете!-");
                while (points <= 100) {
                    sleep(2000);

                    System.out.println(points + 1+ " пунктов");
                    sleep(1000);
                    break;
                }

                System.out.println("Вы гений!");
                points++;

            } else {
                System.out.print("К сожелению это не правильно. Правельный ответ = ");
                sleep(2000);
                System.out.println(levels);

            }
            number++;

        }


    }

}