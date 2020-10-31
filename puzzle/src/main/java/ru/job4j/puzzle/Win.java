package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1){
                    rsl = monoHorizontal(board, row) || monoVertical(board, col);
                    break;
                }
            }
        }

        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;

        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static boolean monoVertical(int[][] board, int col) {
        boolean result = true;

        for (int[] numbers : board) {
            if (numbers[col] != 1) {
                result = false;
                break;
            }
        }

        return result;
    }
}
