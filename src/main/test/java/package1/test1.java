package package1;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import Jason.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.suite.api.*;
//import org.junit.platform.commons.util.*;
import org.apache.commons.lang3.StringUtils;


public class test1 {

    @BeforeAll
    static void setUp(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @ParameterizedTest
    @ValueSource(strings = {"","    ","good"})
    @Timeout(1)
    @NullAndEmptySource
    @Tag("good test")
    public void testSring(String str) throws InterruptedException{
        Thread.sleep(500);
        assertTrue(str == null );
    }


    @Test
    void testCase1(){

        Assertions.assertEquals(40, Calculate.subtract(42,2),"减法处理");
        System.out.println("case1 executed");
        Assertions.assertEquals(40, Calculate.subtract(42,2),"减法处理");
        System.out.println("case1-2 executed");
    }

    @Test
    void testOnDev(){
        System.setProperty("ENV","DEV");
        Assertions.assertEquals(40, Calculate.subtract(42,2),"减法处理");
        System.out.println("假设执行了一段");
        Assumptions.assumeTrue("Dev".equals(System.getProperty("ENV")));

    }

    @Test
    void testCase2(){
        System.out.println("execute case2");
        Assertions.assertEquals(55, Calculate.divide(110,2),"除法处理");
    }



    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }


}
