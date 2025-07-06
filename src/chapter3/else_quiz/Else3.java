package chapter3.else_quiz;

import java.util.Scanner;

/**
 * 두 개의 정수를 입력 받아 첫 번째 수가 더 작으면 1을, 아니면 0을 출력하고, 두 개의 수가 같으면 1을, 아니면 0을 출력하는 프로그램을 작성하세요.
 * 입력: 첫 번째 줄에 정수 A,B가 공백을 사이에 두고 주어집니다.
 * 제한 조건: 1 <= A,B <= 100
 * 출력: 결과값 숫자 두 개를 공백을 사이에 두고 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 8 10
 *
 * 출력
 * 1 0
 * 예제 2
 * 입력
 * 15 15
 *
 * 출력
 * 0 1
 */

public class Else3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if((A < 0 || A > 100) || (B < 0 || B > 100)) {
            System.out.println("Invalid input");
            return;
        }

        System.out.print(A < B ? 1 : 0);
        System.out.print(" ");
        System.out.print(A == B ? 1 : 0);
    }
}
