package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KidsWithGreatestNumberOfCandiesTest {

    private KidsWithGreatestNumberOfCandies kidsWithGreatestNumberOfCandies;

    @BeforeEach
    void setUp() {
        kidsWithGreatestNumberOfCandies = new KidsWithGreatestNumberOfCandies();
    }

    @Test
    void kidsWithCandies_AllCanHaveTheGreatest_ReturnsAllTrue() {
        List<Boolean> expected = Arrays.asList(true, true, true);
        assertEquals(expected, kidsWithGreatestNumberOfCandies.kidsWithCandies(new int[]{2, 3, 1}, 3));
    }

    @Test
    void kidsWithCandies_NoneCanHaveTheGreatest_ReturnsAllFalse() {
        List<Boolean> expected = Arrays.asList(false, false, true);
        assertEquals(expected, kidsWithGreatestNumberOfCandies.kidsWithCandies(new int[]{5, 4, 6}, 1));
    }

    @Test
    void kidsWithCandies_SomeCanHaveTheGreatest_ReturnsMixed() {
        List<Boolean> expected = Arrays.asList(false, false, true);
        assertEquals(expected, kidsWithGreatestNumberOfCandies.kidsWithCandies(new int[]{4, 2, 5}, 1));
    }

    @Test
    void kidsWithCandies_EmptyList_ReturnsEmptyList() {
        List<Boolean> expected = Arrays.asList();
        assertEquals(expected, kidsWithGreatestNumberOfCandies.kidsWithCandies(new int[]{}, 3));
    }

    @Test
    void kidsWithCandies_SingleKid_ReturnsTrue() {
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, kidsWithGreatestNumberOfCandies.kidsWithCandies(new int[]{1}, 1));
    }

}