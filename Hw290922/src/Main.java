import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Оценки для Пети");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (a+b+c) / 3;
        System.out.println("Петя вот твоя средняя оценка!- "+ d);
    }
}