package chapter5.conditional;

import java.util.Scanner;

/**
 * 자연수 N을 입력받아 N이 굉장한 수인지 판단하는 프로그램을 작성해보세요.
 * 굉장한 수이기 위해서는 다음 두 조건 중 하나를 만족해야 합니다.
 * - 홀수이면서 3의 배수인 수
 * - 짝수이면서 5의 배수인 수
 * 입력: 첫 번째 줄에는 N이 주어집니다.
 * 제한 조건: 1 <= N <= 100
 * 출력: 입력받은 수가 굉장한 수라면 true를 아니라면 false를 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 9
 *
 * 출력
 * true
 * 예제 2
 * 입력
 * 18
 *
 * 출력
 * false
 */

public class ConditionQuiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 1 || N > 100) {
            System.out.println("Invalid input");
            return;
        }

        if((N % 2 == 1 && N % 3 == 0) || (N % 2 == 0 && N % 5 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
