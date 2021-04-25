package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        float [] numbers = new float[6];
        numbers[0] = 43;
        numbers[1] = 5;
        numbers[2] = 23;
        numbers[3] = 17;
        numbers[4] = 2;
        numbers[5] = 14;



        System.out.println("The Average is " + (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]+numbers[5]) / 6 );
    }
}
