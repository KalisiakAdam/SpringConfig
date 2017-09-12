import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class FactorialTest {

    private int input;
    private int expected;

    private static Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    public FactorialTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Integer[]> data() {
        return Arrays.asList(new Integer[][] {
                {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}
        });
    }

    @Test
    public void isItFactorialNumber() {
        assertThat(factorial.factorial(input), is(expected));
    }
}
