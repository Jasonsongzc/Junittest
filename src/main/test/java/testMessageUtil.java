import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.InvalidClassException;
import java.util.concurrent.TimeUnit;
@Timeout(7)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class testMessageUtil {
    @Nested
    public class NestedClass{
        @Order(1)
        @Test
        @Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
        void testPrintMessage() throws InterruptedException{
            MessageUtil messageUtil = new MessageUtil("good news");
            assertEquals("good news",messageUtil.getMessage());

            assertThrows(ArithmeticException.class,() ->{messageUtil.printMessage();});
        }
        
        @Order(2)
        @Test
        void testMessage() throws InterruptedException{
            Thread.sleep(1000);
        }
    }

}
