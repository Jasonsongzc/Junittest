package pagkage2;
import Jason.Calculate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("deprecation")
public class test2 {
    @SuppressWarnings("deprecation")
    @Test
    void testAdd() {
        Calculate test = new Calculate();
        int result = test.add(3, 5);
        Assertions.assertEquals(8,result);
    }

    @Test
    void testSubtract() {
        Calculate test = new Calculate();
        int result = test.subtract(12, 7);
       assertEquals( 5,result);//注意，如果出现横线，说明导入包不正确
    }

    @Test
    void testMultiply() {
        Calculate test = new Calculate();
        int result = test.multiply(5, 8);
        assertEquals( 41,result);
    }


    @Test
    void testDevide() {
        Calculate test = new Calculate();
        int result = test.divide(60, 4);
        assertEquals( 15, result);
    }
}
