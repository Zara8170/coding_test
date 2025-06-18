package codetree.chapter3.if_quiz;

import java.util.Scanner;

/**
 * 정수를 입력받아 출력하고 음수를 구별하는 프로그램을 작성해보세요.
 * 입력: 첫 번째 줄에는 정수 N이 주어집니다.
 * 제한 조건: -100 <= N <= 100
 * 출력
 * 첫째줄에는 입력받은 정수를 출력합니다.
 * 그 정수가 음수일 경우에는 두번째줄에 minus를 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * -13
 *
 * 출력
 * -13
 * minus
 *
 * 예제2
 * 입력
 * 15
 *
 * 출력
 * 15
 */

public class IfQuiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < -100 || N > 100) {
            System.out.println("Invalid input");
            return;
        }

        if(N < 0) {
            System.out.println(N);
            System.out.println("minus");
        } else {
            System.out.println(N);
        }
    }
}
