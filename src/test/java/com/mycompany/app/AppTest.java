package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class AppTest
{

    @Test
    public void testAlwaysValid()
    {
        assertTrue( true );
    }

    @Test
    public void testAlwaysInvalid()
    {
        assertTrue( false );
    }

    @Test
    public void testFlaky()
    {
        int max = 4;
        int min = 1;
        Random random = new Random();
        int rndNumber = random.nextInt(max - min + 1) + min;
        assertTrue(rndNumber != 4);
    }
}
