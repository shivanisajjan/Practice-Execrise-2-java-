package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {
    private static IsPalindrome app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new IsPalindrome();

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
        assertTrue(app.palindrome("shivavihs"));
        assertFalse(app.palindrome("shivavih"));
        assertNotNull( app.palindrome("1234321"));

    }

}
