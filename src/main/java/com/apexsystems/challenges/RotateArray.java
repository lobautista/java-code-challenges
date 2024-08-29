package com.apexsystems.challenges;

import java.util.Arrays;

/*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    Example:
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
 */

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] aux = Arrays.copyOfRange(nums,nums.length-k,nums.length);
        for(int i=nums.length-1;i>=k;i--){
            nums[i]=nums[i-k];
        }
        System.arraycopy(aux,0,nums,0,aux.length);
    }
}
