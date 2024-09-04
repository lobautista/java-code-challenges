package com.apexsystems.challenges;

import java.util.HashSet;
import java.util.Set;

/*
    Given a String str create a function removeNonCoincidences(String str) that removes every character that appear only once in the string
    and return a string with those characters removed.
    You may assume that the string has at least one character that repeats at least once.

    Example:

    str = "aabccdee";
    answer = "aaccee"
    Characters 'b' and 'c' were removed because they don't repeat;
 */
public class RemoveNonCoincidences {

    public static String removeNonCoincidences(String str) {
        Set<Character> set = new HashSet<Character>();

        for(int i=0;i<str.length();i++) {
            Character aux = str.charAt(i);
            if(set.contains(aux)) {
                set.remove(aux);
            } else {
                set.add(aux);
            }
        }
        for(Character s: set) {
            str = str.replace(String.valueOf(s), "");
        }
        return str;
    }
}
