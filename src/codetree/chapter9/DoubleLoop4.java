package codetree.chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정수 N의 값이 주어지면 N x N 모양 구구단을 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 N이 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 9
 *
 * 출력
 * N의 값에 따른 구구단을 입출력 예제와 같이 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 3
 *
 * 출력
 * 1 * 1 = 1, 1 * 2 = 2, 1 * 3 = 3
 * 2 * 1 = 2, 2 * 2 = 4, 2 * 3 = 6
 * 3 * 1 = 3, 3 * 2 = 6, 3 * 3 = 9
 *
 * 예제 2
 * 입력
 * 4
 *
 * 출력
 * 1 * 1 = 1, 1 * 2 = 2, 1 * 3 = 3, 1 * 4 = 4
 * 2 * 1 = 2, 2 * 2 = 4, 2 * 3 = 6, 2 * 4 = 8
 * 3 * 1 = 3, 3 * 2 = 6, 3 * 3 = 9, 3 * 4 = 12
 * 4 * 1 = 4, 4 * 2 = 8, 4 * 3 = 12, 4 * 4 = 16
 */

public class DoubleLoop4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(j == n) {
                    System.out.print(i + " * " + j + " = " + i * j);
                } else {
                    System.out.print(i + " * " + j + " = " + i * j + ", ");
                }
            }
            System.out.println();
        }
    }
}
