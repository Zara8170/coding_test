package codetree.chapter2;

import java.util.Scanner;

/**
 * 두 정수 A,B를 입력받아 두 정수의 합과 평균을 구해 출력하는 프로그램을 작성해보세요
 * 입력: 첫 번째 줄에 정수 A,B가 공백을 사이에 두고 주어집니다.
 * 제한 조건: 1 <= A,B <= 100
 * 출력: 첫 번째 줄에 합과 평균을 공백을 사이에 두고 출력합니다. 평균값은 소수 첫째자리까지 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 2 5
 *
 * 출력
 * 7 3.5
 * 예제 2
 * 입력
 * 7 3
 *
 * 출력
 * 10 5.0
 */

public class IOExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((A < 1 || A > 100) || (B < 1 || B > 100)) {
            System.out.println("Invalid input");
            return;
        }
        double avg = (double) (A + B) / 2;

        System.out.printf("%d + %.1f", A + B, avg);
    }
}
