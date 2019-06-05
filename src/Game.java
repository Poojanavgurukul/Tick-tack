import java.util.Scanner;

public class Game {
    Board board=new Board();
    Turn changedTurn=new Turn();

    void display(){
        board.displayBoard();
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
