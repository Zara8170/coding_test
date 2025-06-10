package chapter3.elseIf_quiz;

import java.util.Scanner;

/**
 * 물의 온도를 정수로 입력받아 0 C 미만일경우엔 ice, 100 C 이상일때는 vapor, 그 사이일때는 water라고 출력하는 프로그램을 작성해주세요.
 * 입력: 첫 번째 줄에는 물의 온도인 정수 n이 주어집니다.
 * 제한 조건: -200 <= n <= 200
 * 출력: 물의 온도에 따른 현재 상태를 문자열로 출력해주세요.
 * 입력 예제
 * 예제1
 * 입력
 * -13
 *
 * 출력
 * ice
 *
 * 예제2
 * 입력
 * 98
 *
 * 출력
 * water
 */

public class ElseIf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < -200 || n > 200) {
            System.out.println("Invalid Input");
            return;
        }

        if(n < 0) {
            System.out.println("ice");
        } else if (n < 100) {
            System.out.println("water");
        } else {
            System.out.println("vapor");
        }
    }
}
