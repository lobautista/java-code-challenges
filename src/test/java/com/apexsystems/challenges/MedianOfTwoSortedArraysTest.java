package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void medianOfTwoSortedArraysTest() {
        int[] nums1 = {1,3,8,10,11,15,15,15};
        int[] nums2 = {2,5,6,15,16,17};
        double expected = 10.5;

        Assert.assertEquals(expected, MedianOfTwoSortedArrays.medianOfTwoSortedArrays(nums1,nums2),0);

        nums1 = new int[]{1, 3};
        nums2 = new int[]{2};
        expected = 2.0;

        Assert.assertEquals(expected, MedianOfTwoSortedArrays.medianOfTwoSortedArrays(nums1,nums2),0);
    }
}
