import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TickTacToe {
    public static void main(String[] args) {
        String[][] board = createBoard();
        int count=0;
        while (true) {
            displayBoard(board);
            String[][] updatedBoard = updateBoardForx(board);
            displayBoard(updatedBoard);
            if (winnerChecker(updatedBoard, " X ")) {
                System.out.println("Winxer X");
                break;
            }
            count += 1;
            if (count == 9) {
                System.out.println("Game Over");
                break;
            }
            updatedBoard = updateBoardForo(updatedBoard);
            if (winnerChecker(updatedBoard, " O ")) {
                System.out.println("Winxer O");
                break;
            }
            count += 1;
        }
    }

    public static String[][] createBoard() {
        String[][] board = new String[][]{
                {" 00", " 01", " 02"},
                {" 10", " 11", " 12"},
                {" 20", " 21", " 22"}
        };

        return board;
    }

    public static void displayBoard(String[][] board) {
        for (String[] boardData : board) {
            for (String boardData1 : boardData) {
                System.out.print(boardData1 + "|");
            }
            System.out.print("\n");
            System.out.println("------------");
        }
    }

    public static String[][] updateBoardForo(String[][] board) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Player O");
        System.out.println("Enter the Row position '0'");
        int secondPlayerRow = inputObj.nextInt();
        System.out.println("Enter the Column position '1'");
        int secondPlayerColumn = inputObj.nextInt();
        board[secondPlayerRow][secondPlayerColumn] = " O ";
        return board;
    }
    public static String[][] updateBoardForx(String[][] board) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Player X");
        System.out.println("Enter the Row position '0'");
        int firstPlayerRow = inputObj.nextInt();
        System.out.println("Enter the Column position '1'");
        int firstPlayerColumn = inputObj.nextInt();
        board[firstPlayerRow][firstPlayerColumn] = " X ";
        return board;
    }

    public static boolean winnerChecker(String[][] board, String a) {
        if (board[0][0].equals(a) && board[0][1].equals(a) && board[0][2].equals(a)) {
            return true;
        } else if (board[1][0].equals(a) && board[1][1].equals(a) && board[1][2].equals(a)) {
            return true;
        } else if (board[2][0].equals(a) && board[2][1].equals(a) && board[2][2].equals(a)) {
            return true;
        } else if (board[0][0].equals(a) && board[1][1].equals(a) && board[2][2].equals(a)) {
            return true;
        } else if (board[0][2].equals(a) && board[1][1].equals(a) && board[2][0].equals(a)) {
            return true;
        } else if (board[0][0].equals(a) && board[1][0].equals(a) && board[2][0].equals(a)) {
            return true;
        } else if (board[0][1].equals(a) && board[1][1].equals(a) && board[2][1].equals(a)) {
            return true;
        } else if (board[0][2].equals(a) && board[1][2].equals(a) && board[2][2].equals(a)) {
            return true;
        }
        return false;
    }
}