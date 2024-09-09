package com.apexsystems.challenges;

/*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int i=0;
        int j=s.length()-1;

        boolean isPalindrome=true;

        while(i<s.length() && j>=0 && i<=j && isPalindrome){
            if(s.charAt(i)!=s.charAt(j)){
                isPalindrome=false;
            }

            i++;
            j--;
        }

        return isPalindrome;
    }
}
