import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поездка на море");
        Scanner scanner = new Scanner(System.in);
        int Water = scanner.nextInt();
        int air = scanner.nextInt();
        boolean W = (Water>=26);
        boolean airTemperature =(air>=28);
        System.out.println("Поездка на море-" + (W||airTemperature));
    }
}