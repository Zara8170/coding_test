package codetree.chapter3.else_quiz;

import java.util.Scanner;

/**
 * 두 개의 정수 a,b를 입력받아 a가 b보다 크다면 두 수의 곱을 출력하고, 그렇지 않다면 b를 a로 나눈 몫을 출력하는 프로그램을 작성해보세요.
 * 입력: 첫 번째 줄에 두 정수 a,b가 공백을 두고 주어집니다.
 * 제한 조건: 1 <= a,b <= 100
 * 출력: 첫 번째 줄에 크기 비교 결과에 따라, a가 b보다 크다면 두 수의 곱을, 그렇지 않다면 b를 a로 나눈 몫을 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 10 5
 *
 * 출력 50
 *
 * 예제 2
 * 입력 3 10
 *
 * 출력 3
 */

public class Else2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a < 0 || a > 100) || (b < 0 || b > 100)) {
            System.out.println("Invalid input");
            return;
        }

        if (a > b) {
            System.out.println(a * b);
        } else {
            System.out.println(b / a);
        }
    }
}
