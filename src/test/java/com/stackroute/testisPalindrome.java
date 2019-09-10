package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testisPalindrome {
    private static isPalindrome app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new isPalindrome();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testpalindrome()
    {
        assertEquals(
                true , app.palindrome("1234321"));
        assertEquals(
                true, app.palindrome("shivavihs"));
        assertEquals(
                false, app.palindrome("shivavih"));

    }

}
