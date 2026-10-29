package com.pratice;

import com.pratice.learning.Calc;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calc obj = new Calc();

        int unsorted[] = {11, 4, 5, 2, 1};

        int arr[] = obj.sort(unsorted);

        System.out.println(Arrays.toString(arr));
    }
}
