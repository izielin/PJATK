package PracticeLecture.ArraysAdvance;

import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Let's play Tic Tac Toe!");
        System.out.print("Player 1, what is your name? ");
        String p1 = in.nextLine();
        System.out.print("Player 2, what is your name? ");
        String p2 = in.nextLine();

        boolean player1 = true;

        boolean gameEnded = false;
        while (!gameEnded) {

            printBoard(board);

            if (player1) {
                System.out.println(p1 + "'s Turn (x):");
            } else {
                System.out.println(p2 + "'s Turn (o):");
            }

            char c;
            if (player1) {
                c = 'x';
            } else {
                c = 'o';
            }

            int row, col;

            while (true) {
                System.out.print("Enter a row ane col number (0, 1, or 2): ");
                row = in.nextInt();
                col = in.nextInt();

                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("This position is off the bounds of the board! Try again.");
                } else if (board[row][col] != '-') {
                    System.out.println("Someone has already made a move at this position! Try again.");
                } else {
                    break;
                }
            }
            board[row][col] = c;

            if (victoryConditions(board) == 'x') {
                System.out.println(p1 + " has won!");
                gameEnded = true;
            } else if (victoryConditions(board) == 'o') {
                System.out.println(p2 + " has won!");
                gameEnded = true;
            } else {
                if (boardIsFull(board)) {
                    System.out.println("It's a tie!");
                    gameEnded = true;
                } else {
                    player1 = !player1;
                }
            }
        }

        printBoard(board);

    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");

        }
    }

    public static char victoryConditions(char[][] board) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            } else if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return board[0][i];
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }

        return ' ';

    }

    public static boolean boardIsFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}