/**
 * Java 1. Lesson 4. Tic-tac-toe in console
 *
 * @author Rudenko Alexandr
 * @version dated  01/12/2018
 */
import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    void game() {
        initMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printMap();
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    boolean checkWin(char dot) {
        // check horizontals, verticals, diagonals
       
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++)
                if ( (map[i][j] == dot && map[i][j+1] == dot && map[i][j+2] == dot) ||
                      (map[i+1][j] == dot && map[i+1][j+1] == dot && map[i+1][j+2] == dot) ||
                       (map[i+2][j] == dot && map[i+2][j+1] == dot && map[i+1][j+2] == dot) ||
                     (map[i][j] == dot && map[i+1][j] == dot && map[i+2][j] == dot) ||
                        (map[i][j+1] == dot && map[i+1][j+1] == dot && map[i+2][j+1] == dot) ||
                        (map[i][j+2] == dot && map[i+1][j+2] == dot && map[i+2][j+2] == dot) ||
                     (map[i][j] == dot && map[i+1][j+1] == dot && map[i+2][j+2] == dot) ||
                        (map[i+2][j] == dot && map[i+1][j+1] == dot && map[i][j+2] == dot)
                )
                   return true;
        }
       
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY; // by DSerov
    }
}
