package unittesting;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by student on 2017/03/18.
 */
public class UnitTesting {

    private Lecturer lecturer;
    private Student student_IT;
    private Student student_SC;

    @Before
    public void setUp() throws Exception {

        lecturer = new Lecturer("Robert", 35 );
        student_IT = new Student("James", "IT");
        student_SC = new Student("James", "Science");

    }

    // test float point
    @Test
    public void testFloatPoint() throws Exception {

        Assert.assertEquals(12.5, 12.5);

    }


    // test Integers
    @Test
    public void testInteger() throws Exception {

        Assert.assertEquals(4, 4);

    }

    // test Object Identity
    @Test
    public void testObjectIdentity() throws Exception {

        Assert.assertSame(student_IT, student_IT);
        Assert.assertNotSame(student_IT, lecturer);

    }

    // test ObjectEquality
    @Test
    public void testObjectEquality() throws Exception {

        Assert.assertEquals(student_IT, student_IT);

    }

    // test truth
    @Test
    public void testTruth() throws Exception {

        Assert.assertTrue(true);
        Assert.assertTrue( student_IT.getName().equalsIgnoreCase(student_IT.getName()) );

    }

    // test False
    @Test
    public void testFalse() throws Exception {

        Assert.assertFalse(false);

    }

    // test Nullness
    @Test
    public void testNullness() throws Exception {

        student_IT =null;
        Assert.assertNull(student_IT);

    }

    // test Non Nullness
    @Test
    public void testNonNullness() throws Exception {

        Assert.assertNotNull(lecturer);

    }

    // test Fail
    @Test
    public void testFail() throws Exception {

        Assert.assertFalse(true);
        Assert.assertFalse(4 > 3);
    }

    // test Exception Timeout
    @Test(timeout = 11)
    public void testTimeOut() throws Exception {

        while(true){}
    }

    // test Disabling
    @Test
    @Ignore
    public void testDisabling() throws Exception {

        Assert.assertEquals(12, 12);
    }

    // test Arrays
    @Test
    public void testArrays() throws Exception {

        ArrayList<String> myList = new ArrayList<String>();

        for(int i = 0; i < myList.size(); i++) {
            Assert.assertNull(myList.indexOf(i));
        }
   }
}
