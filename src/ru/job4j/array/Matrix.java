package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 && i != 0) {
                    table[i][j] = j + 1 + i;
                }
                if (i == 0) {
                    table[i][j] = j + 1 + i;
                }
                if (i != 0 && j != 0) {
                    table[i][j] = table[0][j] * table[i][0];
                }




                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        return table;
    }
}