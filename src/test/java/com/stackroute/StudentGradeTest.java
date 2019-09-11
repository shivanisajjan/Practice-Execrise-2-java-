package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class StudentGradeTest {
    private static Display app;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new Display();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }

    @Test
    public void testStudentGrade(){
        Double[] input=new Double[]{4.0,5.0,6.0};
        Double[] input1=new Double[]{4.0,5.0,6.0,7.0};
        assertEquals(new Double[]{5.0,6.0,4.0},app.q5(3,input));
        assertEquals(new Double[]{5.5,7.0,4.0},app.q5(4,input1));
    }
}
