import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TickTacToe {
    public static void main(String[] args) {
        Scanner inputObj=new Scanner(System.in);
        displayBoard();
    }
    public static String[][]displayBoard(){
        String [][]board=new String[][]{
                {"1","2","3"},
                {"4","5","6"},
                {"7","8","9"}
        };
        for (String[] number:board) {
            for (String number1:number) {
                System.out.print(number1+"|");
            }
            System.out.print("\n");
        }return board;
    }
}
