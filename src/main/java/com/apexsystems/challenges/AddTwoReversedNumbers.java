package com.apexsystems.challenges;

import java.util.Arrays;

/*
    You are given two non-empty static arrays filled with non-negative integers stored in reverse order,
    Add the two numbers and return the sum reversed as a static array.

    Example:
    Input: num1 = [2,4,3], num2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.

    Example 2:
    Input: num1 = [0], num2 = [0]
    Output: [0]

    Example 3:
    Input: num1 = [9], num2 = [1,9,9,9,9,9,9,9,9,9]
    Output: [0,0,0,0,0,0,0,0,0,0,1]
 */
public class AddTwoReversedNumbers {
    public static int[] addTwoReversedNumbers(int[] list1, int[] list2) {
        long num1 = 0;
        long num2 = 0;
        int index = Math.max(list1.length, list2.length);
        for(int i=0; i<index; i++) {
            if(i < list1.length) num1 += (long) (Math.pow(10,i)*list1[i]);
            if(i < list2.length) num2 += (long) (Math.pow(10,i)*list2[i]);
        }
        String sumAsString = Long.toString(num1+num2);
        int[] result = new int[sumAsString.length()];
        for(int i=0; i<sumAsString.length();i++) {
            result[sumAsString.length()-1-i] = Character.getNumericValue(sumAsString.charAt(i));
        }
        return result;
    }
}
