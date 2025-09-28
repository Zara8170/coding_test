package code;

class deliver_box {
    public int solution(int n, int w, int num) {
        int count = 0;
        int box = num;

        while (box <= n) {
            count++;
            box += w;
        }

        int lastRowLen = n % w;                
        int colIndex1 = (num - 1) % w + 1;

        if (lastRowLen != 0 && lastRowLen < colIndex1) {
            count++;
        }

        return count;
    }
}
