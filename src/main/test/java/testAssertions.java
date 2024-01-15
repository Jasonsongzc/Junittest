import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testAssertions {
    @Test
    public void testAssertions(){
        String str1 = "abc";
        String str2 = "def";
        String str3 = null;
        String str4 = new String("abc");
        String str5 = new String("def");
        String str6 = "abc";
        int val1 = 5;
        int val2 = 6;
        String[] expectedArray = {"one","two","three"};
        String[] resultArray = {"one","two","three"};
        assertEquals(str1,str4);
        assertEquals(str2,str5);
        assertTrue(val1 < val2);
        assertFalse(val1 > val2);
        assertNotNull(str2);
        assertNull(str3);
        assertSame(str1,str6);
        assertNotSame(val1,val2);
        assertArrayEquals(expectedArray,resultArray);

    }
}
