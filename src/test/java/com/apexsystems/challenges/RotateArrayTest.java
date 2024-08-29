package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void rotateTest(){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k=3;
        int[] expected = new int[]{5,6,7,1,2,3,4};
        RotateArray.rotate(nums,k);
        for(int i=0;i<nums.length;i++){
            Assert.assertEquals(expected[i],nums[i]);
        }

        nums = new int[]{-1,-100,3,99};
        k=2;
        expected = new int[]{3,99,-1,-100};
        RotateArray.rotate(nums,k);
        for(int i=0;i<nums.length;i++){
            Assert.assertEquals(expected[i],nums[i]);
        }
    }
}
