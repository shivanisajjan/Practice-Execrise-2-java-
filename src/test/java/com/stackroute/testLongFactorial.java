package com.stackroute;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class testLongFactorial {

    private static LongFactorial app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new LongFactorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }
    @Test
    public void q6Long()
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
