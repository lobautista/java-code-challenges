package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSumTest() {
        int[] nums1 = new int[]{-1,-2,-3,-4,-5};
        int target1 = -8;
        int[] answer1 = new int[]{2,4};
        Assert.assertArrayEquals(answer1, TwoSum.twoSum(nums1, target1));

        int[] nums2 = new int[]{9,7,13,25,6,19,14,4,32,20};
        int target2 = 24;
        int[] answer2 = new int[]{7,9};
        Assert.assertArrayEquals(answer2, TwoSum.twoSum(nums2, target2));
    }
}
