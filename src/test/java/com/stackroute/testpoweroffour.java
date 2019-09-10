package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testpoweroffour {
    private static poweroffour app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new poweroffour();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }

    @Test
    public void testpoweroffour()
    {
        assertEquals(
                true , app.poweroffour(16));
        assertEquals(
                false , app.poweroffour(5));
        assertEquals(
                false , app.poweroffour(-1));
        assertEquals(
                false , app.poweroffour(8));
    }
}
