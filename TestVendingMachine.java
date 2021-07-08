import org.junit.Test;
import static org.junit.Assert.*;

public class TestVendingMachine {
    @Test
    public void testInsertToken(){
        VendingMachine v1 = new VendingMachine();
        v1.insertToken();
        v1.insertToken();
        v1.insertToken();
        assertEquals(3,v1.getTokenCount());

    }

    @Test
    public void testFillUp(){

    }

    @Test
    public void testVendingMachine(){

    }


}
