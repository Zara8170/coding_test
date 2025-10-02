class Solution {
    public int solution(int price) {
        final int SIBMAN = 100000;

        if (price >= 5 * SIBMAN) {          // 20%
            return price * 80 / 100;        // price * (100 - 20) / 100
        } else if (price >= 3 * SIBMAN) {   // 10%
            return price * 90 / 100;
        } else if (price >= SIBMAN) {       // 5%
            return price * 95 / 100;
        } else {
            return price;
        }
    }
}
