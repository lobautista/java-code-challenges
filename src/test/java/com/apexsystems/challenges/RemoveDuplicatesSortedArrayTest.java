package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesSortedArrayTest {

    @Test
    public void removeDuplicates(){

        int[] nums = new int[]{1,1,2};

        int k = RemoveDuplicatesSortedArray.removeDuplicates(nums);

        Assert.assertEquals(2,k);
        int[] expectedNums = new int[]{1,2};
        for(int i=0;i<k;i++){
            Assert.assertEquals(expectedNums[i],nums[i]);
        }

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};

        k = RemoveDuplicatesSortedArray.removeDuplicates(nums);

        Assert.assertEquals(5,k);
        expectedNums = new int[]{0,1,2,3,4};
        for(int i=0;i<k;i++){
            Assert.assertEquals(expectedNums[i],nums[i]);
        }

    }
}
