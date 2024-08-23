package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveElementTest {
    @Test
    public void removeElementTest(){

        int[] nums = new int[]{3,2,2,3};

        int k = RemoveElement.removeElement(nums,3);

        Assert.assertEquals(2,k);
        int[] expectedNums = new int[]{2,2,0,0};
        Arrays.sort(nums,0,k);
        for(int i=0;i<k;i++){
            Assert.assertEquals(expectedNums[i],nums[i]);
        }

        nums = new int[]{0,1,2,2,3,0,4,2};

        k = RemoveElement.removeElement(nums,2);

        Assert.assertEquals(5,k);
        expectedNums = new int[]{0,0,1,3,4};
        Arrays.sort(nums,0,k);
        for(int i=0;i<k;i++){
            Assert.assertEquals(expectedNums[i],nums[i]);
        }
    }
}
