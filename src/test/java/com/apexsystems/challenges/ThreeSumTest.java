package com.apexsystems.challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {

    @Test
    public void threeSumTest(){
        ThreeSum threeSum = new ThreeSum();
        int[] nums = new int[]{-1,0,1,2,-1,-4};

        assertEquals("[[-1, -1, 2], [-1, 0, 1]]", threeSum.threeSum(nums).toString());
        nums = new int[]{0,1,1};
        assertEquals("[]", threeSum.threeSum(nums).toString());
        nums = new int[]{0,0,0};
        assertEquals("[[0, 0, 0]]", threeSum.threeSum(nums).toString());
    }

}
