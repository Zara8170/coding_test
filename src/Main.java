class Solution {
    public int solution(int[][] signals) {
        int n = signals.length;
        int limit = 100000;

        int[] cycle = new int[n];
        for (int i = 0; i < n; i++) {
            cycle[i] = signals[i][0] + signals[i][1] + signals[i][2];
        }

        for (int t = 1; t <= limit; t++) {
            boolean allYellow = true;
            for (int i = 0; i < n; i++) {
                int pos = (t - 1) % cycle[i] + 1;
                int g = signals[i][0];
                int y = signals[i][1];
                if (pos < g + 1 || pos > g + y) {
                    allYellow = false;
                    break;
                }
            }
            if (allYellow) return t;
        }

        return -1;
    }
}
