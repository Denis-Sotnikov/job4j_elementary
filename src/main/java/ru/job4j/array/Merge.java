package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Merge {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] b = new int[a1.length + a2.length];
        int positionA1 = 0;
        int positionA2 = 0;
        for (int i = 0; i < b.length; i++) {
            if (positionA1 == a1.length) {
                b[i] = a2[positionA2];
                positionA2++;
            } else if (positionA2 == a2.length) {
                b[i] = a1[positionA1];
                positionA1++;
            } else if (a1[positionA1] < a2[positionA2]) {
                b[i] = a1[positionA1];
                positionA1++;
            } else {
                b[i] = a2[positionA2];
                positionA2++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {3, 4, 5, 6, 7};
        int[] ar = mergeArrays(one, two);
        for (int w:ar) {
            System.out.print(w + " ");
        }
    }
}
