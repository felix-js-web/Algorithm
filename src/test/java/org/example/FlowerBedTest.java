package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlowerBedTest {

    private FlowerBed flowerBed;

    @BeforeEach
    void setUp() {
        flowerBed = new FlowerBed();
    }

    @Test
    void canPlaceFlowers_EmptyFlowerbed_ReturnsFalse() {
        assertFalse(flowerBed.canPlaceFlowers(new int[]{}, 1));
    }

    @Test
    void canPlaceFlowers_NullFlowerbed_ReturnsFalse() {
        assertFalse(flowerBed.canPlaceFlowers(null, 1));
    }

    @Test
    void canPlaceFlowers_NoSpaceForFlowers_ReturnsFalse() {
        assertFalse(flowerBed.canPlaceFlowers(new int[]{1, 0, 0, 0, 0 , 1}, 2));
    }

    @Test
    void canPlaceFlowers_SpaceForExactlyNFlowers_ReturnsTrue() {
        assertTrue(flowerBed.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    void canPlaceFlowers_MoreThanEnoughSpaceForNFlowers_ReturnsTrue() {
        assertTrue(flowerBed.canPlaceFlowers(new int[]{0, 0, 1, 0, 0, 1, 0, 0}, 2));
    }

    @Test
    void canPlaceFlowers_SpaceForLessThanNFlowers_ReturnsFalse() {
        assertFalse(flowerBed.canPlaceFlowers(new int[]{0, 1, 0}, 2));
    }
}