package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;


public class MergeSortedArrayTest {

    @Test
    public void mergeTest(){

        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6},MergeSortedArray.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3));
        Assert.assertArrayEquals(new int[]{1},MergeSortedArray.merge(new int[]{1},1,new int[]{},0));
        Assert.assertArrayEquals(new int[]{1},MergeSortedArray.merge(new int[]{0},0,new int[]{1},1));

    }
}
