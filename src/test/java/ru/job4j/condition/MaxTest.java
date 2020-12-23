package test.java.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To6And8Then8() {
        int result = Max.max(5, 6, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax5000To67And800Then5000() {
        int result = Max.max(5000, 67, 800);
        assertThat(result, is(5000));
    }
}