import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '_';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char [][] field;

    private static void initField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMPTY_DOT;
            }
        }
    }

    private static void printField() {
        System.out.println("_y_y_y_");
        for (int y = 0; y <fieldSizeY; y++) {
            System.out.print("x");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Enter coordinates X and Y(1 to 3) separated by space:");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isEmptyCell(x, y) || !isValidCell(x, y));
        field[y][x] = HUMAN_DOT;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == EMPTY_DOT;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;

    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = AI_DOT;
    }

    private static boolean isFieldFull() {
        for (int y  = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(x,y))
                    return false;
            }
        }
        return true;
    }

    private static boolean checkWin (char c) {

        // не смог честно говоря сам придумать, несколько неудачных попыток только было.
        // В итоге с использованием google только получилось "решить"
        // остальные задания даже не стал пробовать - не могу до конца разобраться, как цикл checkWin работает
        // и как нужно было сделать проще

        boolean cols, rows;
        for (int y = 0; y < fieldSizeY; y++) {
            cols = true;
            rows = true;
            for (int x = 0; x < fieldSizeX; x++) {
                cols &= (field[y][x] == c);
                rows &= (field[y][x] == c);
            }
            if (cols || rows) return true;
        }

        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < 3; i++) {
            toright &= (field[i][i] == c);
            toleft &= (field[3-i-1][i] == c);
        }
        if (toright || toleft) return true;
        return false;
    }
//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
//
//        return false;
//    }

    public static void main (String[] args) {
        initField();
        printField();
        while (true) {
        humanTurn();
        printField();
            if (checkWin(HUMAN_DOT)) {
                System.out.println("Player wins");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("Computer wins");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Draw");
                break;
            }
        }
    }
}
