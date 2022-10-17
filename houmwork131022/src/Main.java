import java.util.Scanner;

import static java.lang.Thread.sleep;

//First level: Вводится число. Напишите на экран сообщение
// "Я начинаю разбираться с циклами" количество раз, равное этому числу
//
//
//Second level: В программу вводится 1 число. Выведите на экран его факториал,
// используя цикл while
//https://math-prosto.ru/ru/pages/factorial/factorial///
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int number = 0;
        while (number<firstNumber) {
            number++;
            System.out.println(number +" я начинаю работать с циклами.");
        }


    }}