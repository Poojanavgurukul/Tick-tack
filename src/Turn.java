public class Turn {
    public String symbol;
    public int count;

    public Turn() {
        this.symbol = symbol;
        this.count = count;
    }
    public String changedTurn() {
        if(count%2==0){
            symbol="x";
        }
        else{
            symbol="o";
        }
        count++;
        return symbol;
    }

    String getSymbol() {
        return symbol;
    }
}