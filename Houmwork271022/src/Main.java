import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //First level: Level1
        //Дано целое число, не меньшее 2.
        // Выведите его наименьший делитель, отличный от 1.
        // (число, на которое введенное число делится без остатка).
        //
        //
        //Level2
        //Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов, после чего дробная часть копеек отбрасывается. Каждый год сумма вклада становится больше.
        // Определите, сколько будет на счету через k лет
       int x = scanner.nextInt();
        for (int a = 2; a < x; a++){
            if (x % a ==0){
        System.out.println("Наименьший делитель- " + a);
    }

}}}