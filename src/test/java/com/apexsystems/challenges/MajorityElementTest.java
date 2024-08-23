package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void majorityElementTest(){
        Assert.assertEquals(3,MajorityElement.majorityElement(new int[]{3,2,3}));
        Assert.assertEquals(2,MajorityElement.majorityElement(new int[]{2,2,1,1,1,2,2}));
        Assert.assertEquals(5,MajorityElement.majorityElement(new int[]{6,5,5}));

    }

}
