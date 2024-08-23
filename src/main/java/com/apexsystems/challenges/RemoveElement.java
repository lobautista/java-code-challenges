package com.apexsystems.challenges;

/*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
    The remaining elements of nums are not important as well as the size of nums.

    Return k.
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        int i = 0;
        while(i<k){
            if(nums[i]==val){
                for(int j=i;j<k-1;j++){
                    nums[j]=nums[j+1];
                }
                k--;
            }else{
                i++;
            }
        }

        return k;
    }

}
