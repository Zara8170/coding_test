package baekjoon.repeat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 역피라미드 출력
public class Repeat4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            for(int k = N - 1; k >= i; k--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
