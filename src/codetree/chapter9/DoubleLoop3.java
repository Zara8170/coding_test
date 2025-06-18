package codetree.chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정수 N이 주어졌을 때, 아래 예를 참고하여 *로 이루어진 직각삼각형을 출력하는 프로그램을 작성해보세요.
 * 예) N = 3일때
 *   *
 *   ***
 *   *****
 * 예) N = 5일때
 *   *
 *   ***
 *   *****
 *   *******
 *   *********
 *
 * 입력
 * 첫 번째 줄에 N이 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 10
 *
 * 출력
 * N의 값에 따른 별표를 입출력 예제와 같이 출력합니다.
 *
 * 입력 예제
 * 입력
 * 5
 *
 * 출력
 *   *
 *   ***
 *   *****
 *   *******
 *   *********
 */

public class DoubleLoop3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}