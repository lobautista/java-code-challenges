package com.apexsystems.challenges;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInStringTest {

    @Test
    public void reverseWords(){
        Assert.assertEquals("blue is sky the",ReverseWordsInString.reverseWords("the sky is blue"));
        Assert.assertEquals("world hello",ReverseWordsInString.reverseWords("  hello world  "));
        Assert.assertEquals("example good a",ReverseWordsInString.reverseWords("a good   example"));
    }

}
