package chapter3.elseIf_quiz;

import java.util.Scanner;

/**
 * 시험점수에 따라 등급을
 * 90점 이상을 A,
 * 80점 이상을 B,
 * 70점 이상을 C,
 * 60점 이상을 D,
 * 60점 미만을 F라고 합니다.
 * 점수를 입력받아 등급을 출력하는 프로그램을 작성해주세요.
 * 입력: 첫 번째 줄에는 정수 N이 주어집니다.
 * 제한 조건: 0 <= N <= 100
 * 출력: 점수에 해당하는 등급을 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 91
 *
 * 출력
 * A
 * 예제 2
 * 입력
 * 76
 *
 * 출력
 * C
 */

public class ElseIf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 0 || N > 100) {
            System.out.println("Invalid Input");
            return;
        }

        if(N >= 90) {
            System.out.println("A");
        } else if(N >= 80) {
            System.out.println("B");
        } else if(N >= 70) {
            System.out.println("C");
        } else if(N >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
