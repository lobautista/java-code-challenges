package com.apexsystems.challenges;

import java.util.ArrayList;
import java.util.List;

/*
    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

    Example 1:

    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.

    Example 2:

    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianOfTwoSortedArrays {
    public static double medianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> sorted = new ArrayList<Integer>();
        int index1 = 0;
        int index2 = 0;
        double median = 0;
        while(index1 != nums1.length || index2 != nums2.length) {
            if(nums2.length == index2 || (index1 < nums1.length && nums1[index1] < nums2[index2])) {
                sorted.add(nums1[index1]);
                index1++;
            } else {
                if(index2 < nums2.length){
                    sorted.add(nums2[index2]);
                    index2++;
                }
            }
        }
        if(sorted.size()%2 == 0) median = (double) (sorted.get(sorted.size() / 2) + sorted.get(sorted.size() / 2 - 1)) /2;
        else median = sorted.get(sorted.size()/2);
        return median;
    }
}
