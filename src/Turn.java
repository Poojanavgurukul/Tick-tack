public class Turn {
    public String symbol;
    public int count;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public Turn() {
        this.symbol = symbol;
        this.count = count;
    }
    public String changedTurn() {
        if(count%2==0){
            symbol=ANSI_YELLOW+"  X "+ANSI_RESET;
        }
        else{
            symbol=ANSI_BLUE+"  O "+ANSI_RESET;
        }
        count++;
        return symbol;
    }

    String getSymbol() {
        return symbol;
    }
}