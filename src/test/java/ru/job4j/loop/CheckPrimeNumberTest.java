package test.java.ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.CheckPrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
    @Test
    public void when9() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
}