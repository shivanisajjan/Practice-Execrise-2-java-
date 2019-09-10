package com.stackroute;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class testMember {
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
    public void q3()
    {
        ArrayList list = new ArrayList();
        list.add("shivani");
        list.add(21);
        list.add(50000.00);
        assertEquals(list,app.mem("shivani",21,50000.00));
        list.clear();

        list.add("poorvi");
        list.add(22);
        list.add(50000.00);
        assertEquals(list,app.mem("poorvi",22,50000.00));
        list.clear();

        list.add("Hari Priya");
        list.add(22);
        list.add(50000.00);
        assertEquals(list,app.mem("Hari Priya",22,50000.00));
        list.clear();
    }

}
