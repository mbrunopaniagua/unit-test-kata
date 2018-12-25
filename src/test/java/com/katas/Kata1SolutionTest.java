package com.katas;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Kata1SolutionTest {
    private final Kata1 kata1 = new Kata1Solution();

    @Test(expected = IllegalArgumentException.class)
    public void t1() {
        int anyNumberOfCharacters = 1;

        kata1.numberOfAs(null, anyNumberOfCharacters);
    }

    @Test(expected = IllegalArgumentException.class)
    public void t2() {
        String anyString = "";

        kata1.numberOfAs(anyString, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void t3() {
        String anyString = "";

        kata1.numberOfAs(anyString, -1);
    }

    @Test
    public void t4() {
        int repeatedChar = kata1.numberOfAs("b", 1);

        assertThat(repeatedChar, is(0));
    }

    @Test
    public void t5() {
        int repeatedChar = kata1.numberOfAs("a", 1);

        assertThat(repeatedChar, is(1));
    }

    @Test
    public void t6() {
        int repeatedChar = kata1.numberOfAs("aba", 10);

        assertThat(repeatedChar, is(7));
    }

    @Test
    public void t7() {
        int repeatedChar = kata1.numberOfAs("aba", 2);

        assertThat(repeatedChar, is(1));
    }

    @Test
    public void t8() {
        int repeatedChar = kata1.numberOfAs("a", 100000000);

        assertThat(repeatedChar, is(100000000));
    }
}
