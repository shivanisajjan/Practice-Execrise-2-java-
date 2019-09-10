package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testIntFactorial {
    private static Intfactorial app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new Intfactorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }


    @Test
    public void q6Int()
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
}
