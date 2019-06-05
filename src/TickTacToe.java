import java.util.Scanner;
public class TickTacToe {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        Game game=new Game();
        System.out.println(game.display());
        while (game.isRunning()){
            game.play(getInput());
            System.out.println(game.display());
        }
        if (game.winnerChecker()==null){
            System.out.println(ANSI_RED+"game over"+ANSI_RESET);
            return;
        }
        System.out.println(game.winnerChecker());
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