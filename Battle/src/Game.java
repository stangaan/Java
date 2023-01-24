import java.util.Scanner;

public class Game {

    private final int[][] field;
    int points = 0;
    int attempts = 10;
    int length = 10;
    int width = 5;
    public Game(int[][] field) {
        this.field = field;
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        FieldPrinter fieldPrinter = new FieldPrinter(field.length);

        for (int i = 0; i < 10; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (first < attempts && second < attempts && first >= 0 && second >= 0) {
                int shot = field[first][second];
                if (shot == 0) {
                    System.out.println("Вы не попали");
                    points--;
                    field[first][second] = -1;
                    fieldPrinter.printField(field);

                }
                else if (shot == 2) {
                    points++;
                    points = points + 2;
                    System.out.println("Вы попали в двойной и получили +2 - " + points +" балов!");
                    field[first][second] = -1;
                    fieldPrinter.printField(field);

                } else if (shot == 3) {
                    points++;
                    points = points + 3;
                    System.out.println("Вы попали в тройной и получили +3 - " + points +" балов!");
                    field[first][second] = -1;
                    fieldPrinter.printField(field);

                } else if (shot == 4) {
                    points++;
                    points = points + 4;
                    System.out.println("Вы попали в четвертной и получили +4 - " + points +" балов!");

                    field[first][second] = -1;
                    fieldPrinter.printField(field);

                } else if (shot == 1){
                    points++;
                    points = points + 2;
                    System.out.println("Вы попали в одинарный и получили +1 - " + points +" балов!");
                    field[first][second] = -1;
                    fieldPrinter.printField(field);

                }
            }
            else {
                System.out.println("Что-то куда-то не туда");
            }

        }
        fieldPrinter.printField(field);
        System.out.println("Ты уничтожил короблей- " + points );

        //подсчет очков

        //тут как-то нужно играть
    }

}
