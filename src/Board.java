public class Board {

    public String[][] board;

    public Board() {
        this.board = new String[][]{
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };;
    }

    public  void displayBoard(){
        for (String[] boardData : board) {
            for (String boardData1 : boardData) {
                System.out.print(boardData1 + "|");
            }
            System.out.print("\n");
            System.out.println("-------");
        }
    }
    public void update(int row , int column, String symbol){
        board[row][column]=symbol;
    }
}