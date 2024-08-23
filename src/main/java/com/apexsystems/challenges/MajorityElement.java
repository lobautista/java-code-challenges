package com.apexsystems.challenges;

import java.util.ArrayList;
import java.util.List;

/*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {

        List<Integer> countedNums = new ArrayList<>();

        int i =0;
        int count=0;
        int num=0;
        while(i<nums.length && count<=(nums.length/2)) {
            num = nums[i];
            count = 0;
            if (!countedNums.contains(num)) {
                for (int n : nums) {
                    if (n == num) {
                        count++;
                    }
                }
                countedNums.add(num);
            }
            i++;
        }

        return num;
    }
}
