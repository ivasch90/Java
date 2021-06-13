package HomeWorkApp;
import java.util.Random;
import java.util.Scanner;

public class TikTakToe {

    static final char EMPTY_CELL_SYMBOL = '-';

    public static void start() {
        char[][] field = {
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL}
        };

        drawField(field);

        do {
            doPlayerMove(field);
            drawField(field);
            if (isWin(field, 'X')) {
                System.out.println("Congratulations!!! You are winner.");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw!!!");
                break;
            }

            doBotMove(field);
            drawField(field);
            if (isWin(field, 'O')) {
                System.out.println("Sorry!!! You are loser. :(");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw!!!");
                break;
            }
        } while (true);

    }

    static boolean isDraw(char[][] field) {
        for (int v = 0; v < field.length; v++) {
            for (int h = 0; h < field.length; h++) {
                if (isEmptyCell(field, v, h)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isEmptyCell(char[][] field, int v, int h) {
        return field[v][h] == EMPTY_CELL_SYMBOL;
    }

    static boolean isNotEmptyCell(char[][] field, int v, int h) {
        return !isEmptyCell(field, v, h);
    }

    static boolean isWin(char[][] field, char sign) {
        boolean checkHor, checkVer, checkDiag1, checkDiag2;
        for (int i = 0; i < field.length; i++) {
            checkHor = true;
            checkVer = true;
            checkDiag1 = true;
            checkDiag2 = true;

            for (int j = 0; j < field.length; j++) {
                checkHor &= (field[i][j] == sign);
                checkVer &= (field[j][i] == sign);
                checkDiag1 &= (field[j][j] == sign);
                checkDiag2 &= (field[field.length - 1 - j][j] == sign);

            }
            if (checkHor || checkVer || checkDiag1 || checkDiag2)
                return true;
        }
        return false;
    }

    static void doBotMove(char[][] field) {
        Random random = new Random();

        int v, h;
        do {
            v = random.nextInt(3);
            h = random.nextInt(3);
        } while (isNotEmptyCell(field, v, h));

        field[v][h] = 'O';
    }

    static void doPlayerMove(char[][] field) {
        int v, h;
        do {
            v = getCoordinate(field, 'v');
            h = getCoordinate(field, 'h');
        } while (isNotEmptyCell(field, v, h));

        field[v][h] = 'X';
    }

    static int getCoordinate(char[][] field, char coordinateName) {
        Scanner scanner = new Scanner(System.in);

        int coordinate;
        do {
            System.out.printf("Please enter %s-coordinate [1..3] ...%n", coordinateName);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= field.length);

        return coordinate;
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
    }

}