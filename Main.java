package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] tictac = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tictac[i][j] = '_';
            }
        }
        printTicTac(tictac);

        System.out.println("Enter the coordinate: ");
        String[] coordinate;
        String x;
        String y;
        int positionX;
        int positionY;

        while (chekWins(tictac)) {
            do {
                coordinate = scan.nextLine().split(" ");
                x = coordinate[0];
                y = coordinate[1];
                positionX = Integer.parseInt(x);
                positionY = Integer.parseInt(y);
            } while (!checkOfNumber(positionX, positionY) || (!fullField(positionX, positionY, tictac)));
            printTicTac(tictac);
            if (!chekWins(tictac)) {
                break;
            }
            turnPlayer2(tictac);
            printTicTac(tictac);
        }

    }

    private static boolean chekWins(char[][] arr) {
        boolean result = true;
        int line1 = arr[0][0] + arr[0][1] + arr[0][2];
        int line2 = arr[1][0] + arr[1][1] + arr[1][2];
        int line3 = arr[2][0] + arr[2][1] + arr[2][2];
        int row1 = arr[0][0] + arr[1][0] + arr[2][0];
        int row2 = arr[0][1] + arr[1][1] + arr[2][1];
        int row3 = arr[0][2] + arr[1][2] + arr[2][2];
        int diagon1 = arr[0][0] + arr[1][1] + arr[2][2];
        int diagon2 = arr[0][2] + arr[1][1] + arr[2][0];
        if (line1 == 264 || line2 == 264 || line3 == 264 || row1 == 264 || row2 == 264 || row3 == 264 || diagon1 == 264 || diagon2 == 264) {
            System.out.println("X wins");
            result = false;
        } else if (line1 == 237 || line2 == 237 || line3 == 237 || row1 == 237 || row2 == 237 || row3 == 237 || diagon1 == 237 || diagon2 == 237) {
                System.out.println("O wins");
                result = false;
        } else {
            System.out.println("Draw");
        }
        return result;

    }



    private static void turnPlayer2(char[][] tictac) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tictac[i][j] == '_') {
                    tictac[i][j] = 'O';
                    return;
                }
            }
        }
    }
    private static void printTicTac(char[][] tictoc) {
        System.out.println("---------");
        System.out.println("| " + tictoc[0][0] + " " + tictoc[0][1] + " " + tictoc[0][2] + " |" );
        System.out.println("| " + tictoc[1][0] + " " + tictoc[1][1] + " " + tictoc[1][2] + " |" );
        System.out.println("| " + tictoc[2][0] + " " + tictoc[2][1] + " " + tictoc[2][2] + " |" );
        System.out.println("---------");
    }

    private static boolean checkOfNumber(int x, int y) {
        if (x != 1 && x != 2 && x != 3 || y != 1 && y != 2 && y != 3) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }
        return true;
    }

    private static boolean fullField(int x, int y, char[][] tictac) {
        if (x == 1 && y == 1) {
            if (tictac[0][0] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[0][0] = 'X';
        }
        if (x == 1 && y == 2) {
            if (tictac[0][1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[0][1] = 'X';
        }
        if (x == 1 && y == 3) {
            if (tictac[0][2] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[0][2] = 'X';
        }
        if (x == 2 && y == 1) {
            if (tictac[1][0] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[1][0] = 'X';
        }
        if (x == 2 && y == 2) {
            if (tictac[1][1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[1][1] = 'X';
        }
        if (x == 2 && y == 3) {
            if (tictac[1][2] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[1][2] = 'X';
        }
        if (x == 3 && y == 1) {
            if (tictac[2][0] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[2][0] = 'X';
        }
        if (x == 3 && y == 2) {
            if (tictac[2][1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[2][1] = 'X';
        }
        if (x == 3 && y == 3) {
            if (tictac[2][2] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.println("Enter the coordinate: ");
                return false;
            }
            tictac[2][2] = 'X';
        }
        return true;
    }
}

