package chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * l��수 N과 M의 값을 입력�아 별표로 이루어진 직��각형을 출력하는 프로�7�램을 아래 예를 참고하l�� 작성해보세요.
 * 예)
 * N에 3을 M에 5를 입력�0�는 경우
 *    * * * * *
 *    * * * * *
 *    * * * * *
 *
 * 입력
 * 첫 번째 �에 세로변의 길이 N과, �0�로변의 길이 M이 공백� 사이에 두고 주어집니��.
 *
 * 제한 조건
 * 1 <= N, M <= 9
 *
 * 출력
 * l��어지는 N과 M의 값에 �0른 별표를 입출력 예제�� 같이 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 4 2
 *
 * 출력
 *  * *
 *  * *
 *  * *
 *  * *
 */

public class DoubleLoop1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
