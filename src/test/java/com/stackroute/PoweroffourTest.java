package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PoweroffourTest {
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
        assertTrue(app.poweroffour(16));
        assertFalse(app.poweroffour(5));
        assertNotNull(app.poweroffour(-1));
        assertEquals(
                false , app.poweroffour(8));
    }
}
