import org.junit.Test;

public class VendingMachine {
    private int tokenAmount;
    private int canAmount;

    public VendingMachine(){
        tokenAmount = 0;
        canAmount = 10;

    }

    public VendingMachine(int startingCans){
        tokenAmount = 0;
        canAmount = startingCans;

    }

    public void FillUp(int newCans){
        canAmount += newCans;
    }

    public void insertToken(){
        this.tokenAmount += 1;
        this.canAmount += 1;
    }

    public int getCanCount(){
        return this.canAmount;
    }

    public int getTokenCount(){
        return this.tokenAmount;
    }


}
