package codetree.chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정수 N이 주어지면, 1부터 N까지의 수에 대해, i( 1<= i <= N)번째 줄에 i개의 i를 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 정수 N이 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 100
 *
 * 출력
 * 1부터 N까지의 수에 대해, i번째 줄에 i개의 i를 공백을 두고 출력합니다.
 *
 * 입력 예제
 * 예제1
 * 입력
 * 3
 *
 * 출력
 * 1
 * 2 2
 * 3 3 3
 *
 * 예제 2
 * 입력
 * 8
 *
 * 출력
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * 6 6 6 6 6 6
 * 7 7 7 7 7 7 7
 * 8 8 8 8 8 8 8 8
 */

public class DoubleLoop5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
