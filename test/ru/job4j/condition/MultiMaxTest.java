package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 4, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(10, 4, 25);
        assertThat(result, is(25));
    }

    @Test
    public void whenAllTheSame() {
        int result = MultiMax.max(10, 10, 10);
        assertThat(result, is(10));
    }
}