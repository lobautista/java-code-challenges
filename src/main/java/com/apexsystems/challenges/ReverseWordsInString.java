package com.apexsystems.challenges;

/*
    Given an input string s, reverse the order of the words.
    A word is defined as a sequence of non-space characters.
    The words in s will be separated by at least one space.
    Return a string of the words in reverse order concatenated by a single space.

    Note that s may contain leading or trailing spaces or multiple spaces between two words.
    The returned string should only have a single space separating the words.
    Do not include any extra spaces.
 */
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String trimmedString=s.trim();
        int wordEnd=trimmedString.length();
        String finalString="";

        for(int i=trimmedString.length()-1;i>=0;i--){
            if(i==0 || trimmedString.charAt(i)==' '){
                String newString=trimmedString.substring(i==0?i:i+1,wordEnd);
                if(!newString.isBlank()){
                    finalString+=(newString+" ");
                }
                wordEnd=i;
            }
        }

        return finalString.trim();
    }
}
