import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TickTacToe {
    public static void main(String[] args) {
        Scanner inputObj=new Scanner(System.in);

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
        }
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.println("Enter x ");
                String player1=inputObj.nextLine();
                System.out.println("Enter o");
                String player2=inputObj.nextLine();
            }
        }
    }
}
