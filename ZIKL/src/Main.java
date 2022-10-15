import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввидите пожалуйста после знака = ваш ответ");

        int number = 99;//Здесь можно так же менят с какой цифры начнуться примеры//
        int points = 4; //пункты за правильный ответ//
        while (number <= 100) {
            int levels = number * 6; //ввидите математический знак + - * / и любое число с которым вы хотите тренироваться//
            System.out.print(number + " * 6" +
                    " = ");//повторите значения со знаком и числом//

            int answer = scanner.nextInt();//здесь вводиться ответ в консоли//
            if (answer == levels) {
                System.out.print("Правильно вы получаете! ");
                while  (points <= 100) {
                    sleep(1000);
                    System.out.println(points + 1 + " пунктов");
                    sleep(1000);
                    break; //этот процес нужно остановить иначе программа не будет переходить
                    //на следующий пример//
                }
                System.out.println("Вы гений!");
                points++;//это увеличивает пункты с каждым правильным ответом.//
            }
            else {
                System.out.print("К сожелению это не правильно. Правельный ответ = ");
                sleep(2000);
                System.out.println(levels);
            }
            if (levels ==600) {
                    System.out.println("Вы действительно математический гений, переходите к другому уровню.");
            }
                number++;
        }

    }}


