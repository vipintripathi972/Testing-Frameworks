package com.pratice.learning;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

public class CalcTest
{
    Calc obj = new Calc();
    @Test
    public void test()
    {
        int res = obj.div(10, 2);
        int exp = 5;

        assertEquals(exp, res);
    }

    @Test
    public void test2()
    {
        try
        {
            int[] unsorted = null;
            int[] arr = obj.sort(unsorted);
            System.out.println("Sorry but this cant be passed");
            fail();

        }
        catch(NullPointerException e)
        {
            System.out.println("Exception handled");
        }
    }

    @Test
    public void test3()
    {
        System.out.println("it will do the same thing as test2");
        int[] arr = null;
        assertThrows(NullPointerException.class, () -> obj.sort(arr));
    }
}
