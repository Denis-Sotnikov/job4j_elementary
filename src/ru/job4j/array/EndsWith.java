package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int size = word.length <= post.length ? word.length : post.length;
            for (int i = 0; i < size; i++) {
                if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                    return false;
                }
            }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}