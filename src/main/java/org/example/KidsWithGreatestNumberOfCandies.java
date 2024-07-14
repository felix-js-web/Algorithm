package org.example;

import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int candiesSize = candies.length;
        Boolean[] candiesBoolean = new Boolean[candiesSize];
        int arraymax = 0;
        for (int i = 0; i < candiesSize; i++) {
            arraymax = Math.max(arraymax, candies[i]);
        }

        for (int i = 0; i < candiesSize; i++) {
            if (arraymax < candies[i] + extraCandies) {
                candiesBoolean[i] = true;
            } else {
                candiesBoolean[i] = false;
            }
        }
        return Arrays.asList(candiesBoolean);
    }

}
