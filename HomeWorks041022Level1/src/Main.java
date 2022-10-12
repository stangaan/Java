import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какова длина строки?");
        //First level: 1) В программу (в консоль) вводится строка. Найдите длину строки,
        // если она больше 10, то выведите true, иначе false
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int size =a.length();
        boolean b = (size>=10);
        if (size<10);
        System.out.println("Длина строки " + size);
        System.out.println(b);
    }
}