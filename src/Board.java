public class Board {

    public String[][] board;

    public Board() {
        this.board = new String[][]{
                {" 00 ", " 01 ", " 02 "},
                {" 10 ", " 11 ", " 12 "},
                {" 20 ", " 21 ", " 22 "}
        };;
    }

    public  String  displayBoard(){
        String boardLine="";
        for (String[] boardData : board) {
            boardLine+="\n";
            for (String boardData1 : boardData) {
               boardLine+= boardData1 + "|";
            }
            boardLine+="\n";
            boardLine+="---------------";
        }
        return boardLine;
    }
    public void update(Position position, String symbol){
        board[position.row][position.column]=symbol;
    }
}
