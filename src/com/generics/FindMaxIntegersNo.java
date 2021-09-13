package com.generics;

//3 Integers find the maximum - Ensure to test code with the Test Case.
public class FindMaxIntegersNo{
    public static Integer findMax(Integer x, Integer y, Integer z) {
        int max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        System.out.printf("The max of three numbers %s %s %s is : %s \n",x,y,z,max);
        return max; // returns the largest object
    }
    public static void main(String[] args) {
        //TC1. 1 max no. at first
        Integer int1 = 99,int2 = 80,int3 = 36;
        Integer max = findMax(int1,int2,int3);

        //TC1 .2 max no. at second
        Integer int4 = 17,int5 = 85,int6 = 50;
        Integer max1 = findMax(int4,int5,int6);

        //TC1. 3 max no. at third
        Integer int7 = 30,int8 = 35,int9 = 76;
        Integer max2 = findMax(int7,int8,int9);
    }


}
