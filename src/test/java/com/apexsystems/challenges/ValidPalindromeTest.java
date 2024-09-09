package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void validPalindrome(){
        Assert.assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(ValidPalindrome.isPalindrome("race a car"));
        Assert.assertTrue(ValidPalindrome.isPalindrome(" "));
    }
}
