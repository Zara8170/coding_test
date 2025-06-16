package chapter3.else_quiz;

import java.util.Scanner;

/**
 * 점수를 입력받아 통과인지, 통과를 못 했다면 몇 점이 더 필요한지 출력하는 프로그램을 작성해주세요.
 * 입력: 첫 번째 줄에는 정수 N이 주어집니다.
 * 제한 조건: 0 <= N <= 100
 * 출력: 입력받은 정수가 80 이상이면 pass라고 출력하고, 그렇지 않다면 몇 점이 더 있어야 통과되는지를 "x more score"라는 메시지로 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 87
 *
 * 출력
 * pass
 *
 * 예제 2
 * 입력
 * 57
 *
 * 출력
 * 23 more score
 */

public class Else1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 1 || N > 100) {
            System.out.println("Invalid input");
            return;
        }

        if(N >= 80) {
            System.out.println("pass");
        } else {
            System.out.println(80 - N + " more score");
        }
    }
}
