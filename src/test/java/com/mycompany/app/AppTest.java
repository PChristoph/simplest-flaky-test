package com.mycompany.app;

import java.util.Random;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testAlwaysValid()
    {
        assertTrue( true );
    }

    public void testAlwaysInvalid()
    {
        assertTrue( false );
    }

    public void testFlaky()
    {
        int max = 4;
        int min = 1;
        Random random = new Random();
        int rndNumber = random.nextInt(max - min + 1) + min;
        assertTrue(rndNumber != 4);
    }
}
