import java.util.Scanner;

public class TickTacToe {
    public static void main(String[] args) {
        Game game=new Game();
        Turn player=new Turn();
        Board board=new Board();
        board.displayBoard();
        game.display();
        int i=0;
        while (true){
            Position placeX=getInput();
            board.update(placeX,player.changedTurn());
            game.display();
            board.displayBoard();
            if(game.winnerChecker(board.board,player.getSymbol())){
                System.out.println("winner"+player.getSymbol());
                break;
            }
            i++;
            if(i==9){
                System.out.println("Game over");
                break;
            }
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

    public static Position getInput(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter position for row");
        int row=input.nextInt();
        System.out.println("Enter position for column");
        int column=input.nextInt();
        Position place=new Position(row,column);
        return place;
    }

}