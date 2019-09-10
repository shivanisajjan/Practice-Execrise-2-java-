package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testisEven {
    private static isEven app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new isEven();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }

    @Test
    public void testIsEven()
    {
        assertEquals(
                true , app.isEven1(16));
        assertEquals(
                false , app.isEven1(5));
    }

}
