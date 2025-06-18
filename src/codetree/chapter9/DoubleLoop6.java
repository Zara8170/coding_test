package codetree.chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정수 N이 주어지면, i( 1 <= i <= N ) 번째 줄에 i개의 수를 출력하는데, 수는 1부터 순서대로 다음과 같이 출력하는 프로그램을 작성해보세요.
 * 예) N = 4
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 *
 * 입력
 * 첫 번째 줄에 정수 N이 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 100
 *
 * 출력
 * 1부터 N까지의 수에 대해, i 번쨰 줄에 i개의 정수를 1부터 순서대로 공백을 사이에 두고 차례대로 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 4
 *
 * 출력
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 *
 * 예제 2
 * 입력
 * 7
 *
 * 출력
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20 21
 * 22 23 24 25 26 27 28
 */

public class DoubleLoop6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
