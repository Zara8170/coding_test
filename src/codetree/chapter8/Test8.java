package codetree.chapter8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 정수를 계속 입력받다가 0이 입력되기 전까지의 결과를 그대로 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 입력으로 몇 개의 줄이 들어올지는 정해져 있지는 않습니다. 각 줄에는 하나의 정수가 주어지며, 그 중 적어도 하나는 0임을 가정해도 좋습니다.
 *
 * 제한 조건
 * 0 <= 주어지는 수 <= 100
 *
 * 출력
 * 0이 주어지기 전까지의 결과를 한 줄에 하나씩 순서대로 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 3
 * 5
 * 0
 *
 * 출력
 * 3
 * 5
 *
 * 예제 2
 * 입력
 * 3
 * 2
 * 4
 * 6
 * 0
 *
 * 출력
 * 3
 * 2
 * 4
 * 6
 */

public class Test8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            System.out.println(n);
        }
    }
}
