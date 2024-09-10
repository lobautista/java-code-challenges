package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoReversedNumbersTest {

    @Test
    public void addTwoReversedNumbersTest() {
        int[] nums1 = new int[]{2,4,3};
        int[] nums2 = new int[]{5,6,4};
        int[] answer = new int[]{7,0,8};
        Assert.assertArrayEquals(answer, AddTwoReversedNumbers.addTwoReversedNumbers(nums1,nums2));

        nums1 = new int[]{0};
        nums2 = new int[]{0};
        answer = new int[]{0};
        Assert.assertArrayEquals(answer, AddTwoReversedNumbers.addTwoReversedNumbers(nums1,nums2));

        nums1 = new int[]{9};
        nums2 = new int[]{1,9,9,9,9,9,9,9,9,9};
        answer = new int[]{0,0,0,0,0,0,0,0,0,0,1};
        Assert.assertArrayEquals(answer, AddTwoReversedNumbers.addTwoReversedNumbers(nums1,nums2));
    }
}
