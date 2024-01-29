class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed.length != 1) {
                    if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        ++count;
                        flowerbed[i] = 1;
                    }
                } else {
                    if (flowerbed[i] == 0) {
                        ++count;
                    }
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                    ++count;
                    flowerbed[i] = 1;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    ++count;
                    flowerbed[i] = 1;
                }
            }
        }
        return n <= count;
    }
}