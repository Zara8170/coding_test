package chapter2;

import java.util.Scanner;

/**
 * 정수 A와 B를 입력받고, A, B, A와 B의 합을 차례대로 출력하는 프로그램을 작성해보세요.
 * 입력: 첫 번쨰 줄에 정수 A와 B가 공백을 사이에 두고 주어집니다.
 * 제한 조건: 1 <= A,B <= 100
 * 출력: A,B, A와 B의 합을 차례대로 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 5 6
 *
 * 출력
 * 5 6 11
 */


public class Scanner6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if((A < 0 || A > 100) || (B < 0 || B > 100) ) {
            System.out.println("Invalid input");
            return;
        }

        System.out.printf("%d %d %d", A, B, A + B);
    }
}
