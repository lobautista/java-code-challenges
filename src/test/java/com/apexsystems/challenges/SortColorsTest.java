package com.apexsystems.challenges;

import org.junit.Test;

public class SortColorsTest {

    @Test
    public void testSortColors() {
        int[] nums = {2,0,2,1,1,0};
        SortColors.sortColors(nums);
        assert(nums[0] == 0);
        assert(nums[1] == 0);
        assert(nums[2] == 1);
        assert(nums[3] == 1);
        assert(nums[4] == 2);
        assert(nums[5] == 2);

        nums = new int[]{2,0,1};
        SortColors.sortColors(nums);
        assert(nums[0] == 0);
        assert(nums[1] == 1);
        assert(nums[2] == 2);
    }
}
