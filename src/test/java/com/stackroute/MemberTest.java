package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MemberTest {
    private static MemberVariable app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new MemberVariable();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }





    @Test
    public void testMember()
    {
        ArrayList list = new ArrayList();
        list.add("shivani");
        list.add(21);
        list.add(50000.00);
        assertEquals(list,app.mem("shivani",21,50000.00));
        list.clear();

        list.add("poorvi");
        list.add(21);
        list.add(50000.00);
        assertNotEquals(list,app.mem("poorvi",22,50000.00));
        list.clear();

        assertNotNull(app.mem("Hari Priya",22,50000.00));
    }

}
