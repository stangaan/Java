import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пожалуйста любое число:- ");
        int Number = scanner.nextInt();
        if (Number%2==0) {
            System.out.println("Это четное число" + Number);
        }
        else {
        System.out.println("У Вас было не четное число а вот Вам четное " + (Number+1));
    }
}}