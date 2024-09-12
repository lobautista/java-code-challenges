package com.apexsystems.challenges;

/*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
    without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        boolean isSubsequence=true;
        while(i<s.length() && isSubsequence){
            boolean found=false;
            while(j<t.length() && !found){
                if(t.charAt(j)==s.charAt(i)){
                    found=true;
                }
                j++;
            }
            if(!found){
                isSubsequence=false;
            }
            i++;
        }
        return isSubsequence;
    }
}
