package org.example;

public class FlowerBed {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {


        if (flowerbed == null || flowerbed.length == 0)
            return false;

        int count = 0;
        int fbLength = flowerbed.length;
        for (int i = 0; i < fbLength; i++) {
            if ((flowerbed[i] == 0) &&
                    (i == fbLength - 1 || flowerbed[i + 1] == 0) &&
                    (i == 0 || flowerbed[i - 1] == 0)
            ) {
                flowerbed[i] = 1;
                count++;
            }

            if (count >= n) return true;
        }
        return false;
    }

}
