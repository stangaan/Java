import java.util.Scanner;
import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
        //Second level: В программу вводится 1 число.
        // Выведите на экран его факториал, используя цикл while
        Scanner scanner = new Scanner(System.in);

            int firstNumber = scanner.nextInt();
        int secondNumber = 1;
        while (secondNumber<=firstNumber){
            firstNumber*=secondNumber;
            secondNumber++;

        }
        System.out.print("факториал = " + secondNumber);

    }
}