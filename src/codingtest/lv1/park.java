package codingtest.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class park {
    static int n = 0;
    static int m = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mats = new int[n];
        for(int i = 0; i < n; i++) {
            mats[i] = sc.nextInt();
        }
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        String[][] park = new String[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                park[i][j] = sc.next();
            }
        }
        
        Arrays.sort(mats);

        n = park.length;
        m = park[0].length;

        for(int i = mats.length - 1; i >= 0; i--) {
            for(int x = 0; x < n; x++) {
                for(int y = 0; y < m; y++) {
                    if(checkSquare(park, mats[i], x, y)) {
                        System.out.println(mats[i]);
                    }
                }
            }
        }

        System.out.println(-1);
    }

    public static boolean checkSquare(String[][] park, int size, int x, int y) {
        if(x + size > n || y + size > m) {
            return false;
        }

        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }

        return true;
    }
}
