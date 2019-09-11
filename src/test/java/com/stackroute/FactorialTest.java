package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    private static Factorial app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new Factorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }


    @Test
    public void testIntFactorial()
    {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(24);
        list.add(120);
        list.add(720);
        list.add(5040);
        list.add(40320);
        list.add(362880);
        list.add(3628800);
        list.add(39916800);
        list.add(479001600);
        list.add("Out of range");
        assertEquals(list,app.factorialInt());
        list.clear();
    }
    @Test
    public void testLongFactorial()
    {
        ArrayList list = new ArrayList();
        list.add(1L);
        list.add(2L);
        list.add(6L);
        list.add(24L);
        list.add(120L);
        list.add(720L);
        list.add(5040L);
        list.add(40320L);
        list.add(362880L);
        list.add(3628800L);
        list.add(39916800L);
        list.add(479001600L);
        list.add(6227020800L);
        list.add(87178291200L);
        list.add(1307674368000L);
        list.add(20922789888000L);
        list.add(355687428096000L);
        list.add(6402373705728000L);
        list.add(121645100408832000L);
        list.add(2432902008176640000L);
        list.add("Out of range");
        assertEquals(list,app.factorialLong());
        list.clear();
    }

}
