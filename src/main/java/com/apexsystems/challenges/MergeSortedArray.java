package com.apexsystems.challenges;

/*
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
    representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
    and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

*/

public class MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0;i<n;i++){
            while(j<=m-1 && nums1[j]<nums2[i]){
                j++;
            }
            for(int k=nums1.length-1;k>j;k--){
                nums1[k]=nums1[k-1];
            }
            nums1[j]=nums2[i];
            m++;
        }
        return nums1;
    }
}
