package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void romanToInt(){

        Assert.assertEquals(3,RomanToInteger.romanToInt("III"));
        Assert.assertEquals(58,RomanToInteger.romanToInt("LVIII"));
        Assert.assertEquals(1994,RomanToInteger.romanToInt("MCMXCIV"));

    }
}
