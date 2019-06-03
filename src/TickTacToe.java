import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TickTacToe {
    public static void main(String[] args) {
        Scanner inputObj=new Scanner(System.in);
        replace(displayBoard(),inputObj);
    }
    public static String[][]displayBoard(){
        String [][]board=new String[][]{
                {"1","2","3"},
                {"4","5","6"},
                {"7","8","9"}
        };
        for (String[] element:board) {
            for (String element1:element) {
                System.out.print(element1+"|");
            }
            System.out.print("\n");
        }return board;
    }
    public static String[][] replace(String[][]board,Scanner inputObj){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.println(board[i][j]);
               // System.out.println("enter x");
               // String player=inputObj.nextLine();
            }
        }return board;
    }

}
