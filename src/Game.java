import java.util.Scanner;

public class Game {
    private Board board=new Board();
    private Turn changedTurn=new Turn();
    public int [][][] winningMove;
    int i = 0;

    public Game() {
        this.winningMove = new int[][][]{
                {{0,0},{0,1},{0,2}},
                {{1,0},{1,1},{1,2}},
                {{2,0},{2,1},{2,2}},
                {{0,0},{1,1},{2,2}},
                {{0,2},{1,1},{2,0}},
                {{0,0},{1,0},{2,0}},
                {{0,1},{1,1},{2,1}},
                {{0,2},{1,2},{2,2}}
        };
    }


    String display(){
        return board.displayBoard();
    }
    void play(Position position){

        board.update(position,changedTurn.changedTurn());
    }
    public  String winnerChecker() {
        if (board.board[0][0].equals(changedTurn.getSymbol()) && board.board[0][1].equals(changedTurn.getSymbol()) && board.board[0][2].equals(changedTurn.getSymbol())) {
            return "winner is "+changedTurn.getSymbol();
        } else if (board.board[1][0].equals(changedTurn.getSymbol()) && board.board[1][1].equals(changedTurn.getSymbol()) && board.board[1][2].equals(changedTurn.getSymbol())) {
            return "winner is "+changedTurn.getSymbol();
        } else if (board.board[2][0].equals(changedTurn.getSymbol()) && board.board[2][1].equals(changedTurn.getSymbol()) && board.board[2][2].equals(changedTurn.getSymbol())) {
            return "winner is "+changedTurn.getSymbol();
        } else if (board.board[0][0].equals(changedTurn.getSymbol()) && board.board[1][1].equals(changedTurn.getSymbol()) && board.board[2][2].equals(changedTurn.getSymbol())) {
            return "winner is "+changedTurn.getSymbol();
        } else if (board.board[0][2].equals(changedTurn.getSymbol()) && board.board[1][1].equals(changedTurn.getSymbol()) && board.board[2][0].equals(changedTurn.getSymbol())) {
            return "winner is "+changedTurn.getSymbol();
        } else if (board.board[0][0].equals(changedTurn.getSymbol()) && board.board[1][0].equals(changedTurn.getSymbol()) && board.board[2][0].equals(changedTurn.getSymbol())) {
            return "winner is "+changedTurn.getSymbol();
        } else if (board.board[0][1].equals(changedTurn.getSymbol()) && board.board[1][1].equals(changedTurn.getSymbol()) && board.board[2][1].equals(changedTurn.getSymbol())) {
            return "winner is "+changedTurn.getSymbol();
        } else if (board.board[0][2].equals(changedTurn.getSymbol()) && board.board[1][2].equals(changedTurn.getSymbol()) && board.board[2][2].equals(changedTurn.getSymbol())) {
            return "winner is "+changedTurn.getSymbol();
        }
        return null;
    }
    boolean isRunning() {
       if (i==9){
           return false;
       }
       i++;
       if (winnerChecker()==null){
           return true;
       }
       return false;
    }
    boolean winningMoves(){
        return false;
    }
}

