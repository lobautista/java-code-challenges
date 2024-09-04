package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class RemoveNonCoincidencesTest {

    @Test
    public void removeNonCoincidences() {
        String str1 = "abbceed";
        String expectedResult1 = "bbee";
        Assert.assertEquals(RemoveNonCoincidences.removeNonCoincidences(str1),expectedResult1);

        String str2 = "aaabcdcaee";
        String expectedResult2 = "aaaccaee";
        Assert.assertEquals(RemoveNonCoincidences.removeNonCoincidences(str2),expectedResult2);
    }
}
