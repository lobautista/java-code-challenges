package com.apexsystems.challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstringTest(){
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }
}
