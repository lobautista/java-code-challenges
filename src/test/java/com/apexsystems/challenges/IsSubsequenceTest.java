package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class IsSubsequenceTest {

    @Test
    public void isSubsequence(){
        Assert.assertTrue(IsSubsequence.isSubsequence("abc","ahbgdc"));
        Assert.assertFalse(IsSubsequence.isSubsequence("axc","ahbgdc"));
        Assert.assertFalse(IsSubsequence.isSubsequence("acb","ahbgdc"));
    }
}
