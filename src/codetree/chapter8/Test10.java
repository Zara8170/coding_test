package codetree.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정수 25를 맞히는 게임을 합니다. 주어지는 정수값이 25보다 작으면 Higher를, 25보다 크면 Lower를 출력하는 작업을 반복하다가,
 * 25가 주어지면 Good을 출력하고 중단하는 프로그램을 작성해보세요.
 *
 * 입력
 * 입력으로 몇 개의 수가 들어올지는 정해져 있지는 않습니다. 첫 번째 줄부터 정수의 값이 한 줄에 하나씩 주어집니다.
 * 단, 25가 최소 한 번 이상 나온다는 가정을 해도 좋습니다.
 *
 * 제한 조건
 * 1 <= 주어지는 수 <= 100
 *
 * 출력
 * 입력값에 따른 문자열 출력값을 한 줄에 하나씩 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 27
 * 10
 * 25
 *
 * 출력
 * Lower
 * Higher
 * Good
 */

/**
 * public class Test10 {
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 *         while (true) {
 *             int n = Integer.parseInt(br.readLine());
 *             if(n > 25) {
 *                 System.out.println("Lower");
 *             } else if (n < 25) {
 *                 System.out.println("Higher");
 *             } else if (n == 25) {
 *                 System.out.println("Good");
 *                 break;
 *             }
 *         }
 *
 *     }
 * }
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 25;

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if(num == input) {
                System.out.println("Good");
                break;
            } else if (input >= num) {
                System.out.println("Lower");
            } else {
                System.out.println("Higher");
            }
        }

    }
}
