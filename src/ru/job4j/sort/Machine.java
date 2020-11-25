package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int summaOfMoney = money - price;
        for (int i = 0; i < coins.length; i++) {
            if (summaOfMoney / coins[i] > 0) {
                for (int j = size; j < size + summaOfMoney / coins[i]; j++) {
                    rsl[j] = coins[i];
                }
                size = size + summaOfMoney / coins[i];
                summaOfMoney = summaOfMoney - coins[i] * (summaOfMoney / coins[i]);
            } else {
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}