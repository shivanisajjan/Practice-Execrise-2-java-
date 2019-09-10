package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class testUser {
    private static DisplayUser app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new DisplayUser();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }

    @Test
    public void q7()
    {
        ArrayList list = new ArrayList();
        list.add(true);
        list.add("shivani");
        assertEquals(list,app.q7(19,"shivani"));
        list.clear();
        list.add(false);
        list.add("shivani");
        assertEquals(list,app.q7(103,"shivani"));
        list.clear();
    }

}
