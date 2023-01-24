import java.util.Random;

public class FieldGenerator {

    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public FieldGenerator(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];


        int countOfShipsTwo = 0;
        while (countOfShipsTwo < 3){
            int a = random.nextInt(0,length);
            int b = random.nextInt(0, width);
            if (field [a][b] ==0){
                field [a][b] = 2;
                countOfShipsTwo++;
            }
        }
        int countOfShipsThree = 0;
        while (countOfShipsThree < 2) {
            int a = random.nextInt(0, length);
            int b = random.nextInt(0, width);
        if (field[a][b] == 0) {
                field[a][b] = 3;
                countOfShipsThree++;
            }}
                int countOfShipsFour = 0;
                while (countOfShipsFour < 1) {
                    int a = random.nextInt(0, length);
                    int b = random.nextInt(0, width);

                    if (field[a][b] == 0) {
                        field[a][b] = 4;
                        countOfShipsFour++;
                    }}
                        int countOfShipsSecond = 0;
                        while (countOfShipsSecond < 5) {
                            int a = random.nextInt(0, length);
                            int b = random.nextInt(0, width);

                            if (field[a][b] == 0) {
                                field[a][b] = 1;
                                countOfShipsSecond++;
                            }}



                        //for (int i = 0; i < 100; i++) {
                        //    int a = random.nextInt(0, length);
                        //    int b = random.nextInt(0, width);
//
                        //    if (field[a][b] == 1) {
                        //        i--;
                        //    }
                        //    else {
                        //        field[a][b] = 1;
                        //    }
                        //}
//

                        return field;
                    }}