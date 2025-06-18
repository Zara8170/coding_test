package codetree.chapter8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 정수 A부터 B까지 숫자를 출력하는 프로그램을 작성해보세요. A에서 시작하여 조건에 맞춰 수를 변경하다 B보다 커지는 순간에 종료해야 합니다.
 * 수가 바뀌는 조건은 다음과 같습니다.
 * - 수가 홀수인 겨웅네느 2배가 됩니다.
 * - 수가 짝수인 경우에는 3만큼 증가합니다.
 *
 * 입력
 * 첫 번째 줄에 정수 A,B가 공백을 사이에 두고 주어집니다.
 *
 * 제한 조건
 * 1 <= A <= B <= 20
 *
 * 출력
 * 첫 번째 줄에 수들을 공백을 사이에 두고 출력합니다. A에서 시작하여 순서대로 출력하되, B를 넘기 전까지만 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 2 13
 *
 * 출력
 * 2 5 10 13
 *
 * 예제 2
 * 입력
 * 3 13
 *
 * 출력
 * 3 6 9
 */

/**
 * public class Test9 {
 *     public static void main(String[] args) throws Exception {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *
 *         int a = Integer.parseInt(st.nextToken());
 *         int b = Integer.parseInt(st.nextToken());
 *
 *         System.out.print(a + " ");
 *         for(int i = a; i <= b; i++) {
 *             if(i % 2 == 1) {
 *                 a = a * 2;
 *                 System.out.print(a + " ");
 *             } else if(i % 2 == 0) {
 *                 a = a + 3;
 *                 System.out.print(a + " ");
 *             }
 *
 *             if(a >= b) {
 *                 break;
 *             }
 *         }
 *     }
 * }
 */
public class Test9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (a <= b) {
            System.out.print(a + " ");
            if (a % 2 == 1) {
                a *= 2;
            } else {
                a += 3;
            }
        }
    }
}
