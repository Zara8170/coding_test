package chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N번에 걸쳐 두 정수 a,b가 주어졌을 때, a부터 b까지의 짝수를 모두 합한 결과를 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 테스트케이스의 수 N이 주어집니다.
 * 두 번째 줄 부터 N개의 줄에 걸쳐 한 줄에 두 정수 a,b가 공백을 두고 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 10
 * 1 <= A <= B <= 10
 *
 * 출력
 * 첫 번째 줄부터 N개의 줄에 걸쳐, 각 줄에 각 테스트 케이스마다 a이상 b이하의 짝수들의 합을 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 3
 * 1 10
 * 1 20
 * 5 30
 *
 * 출력
 * 30
 * 110
 * 234
 */

public class RepeatTheLoop1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int total = 0;
            for (int j = a; j <= b; j++) {
                if (j % 2 == 0) {
                    total += j;
                }
            }

            System.out.println(total);
        }
    }
}
