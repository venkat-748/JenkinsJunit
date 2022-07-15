import static org.junit.jupiter.api.Assertions.*;

public class multiplicationTest {

    @org.junit.Test
    public  void multi(){
        multiplication mul = new multiplication();
        assertEquals(200,  mul.mul(10,20));
    }

}