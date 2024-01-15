import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestJunit1 {
    @Test
    public void testAdd(){
        int num = 5;
        String temp = null;
        String str = "junit works well";
        assertEquals("junit works well",str);
        assertFalse(num > 6);
        assertNull(temp);
        String str1 = "Hello";
        System.out.println(str1.replace("l","w"));
        System.out.println(str1);
    }
}
