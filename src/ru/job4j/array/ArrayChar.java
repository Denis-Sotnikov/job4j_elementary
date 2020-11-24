package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int size = word.length <= pref.length ? word.length : pref.length;
        for (int i = 0; i < size; i++) {
                       if (word[i] != pref[i]) {
                           return false;
                       }

        }
        return result;
    }
}