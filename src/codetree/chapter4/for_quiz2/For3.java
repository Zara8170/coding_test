package codetree.chapter4.for_quiz2;

import java.util.Scanner;

/**
 * A,B 두 자연수를 입력받아 B부터 A까지 1씩 감소하며 그 값을 출력하는 프로그램을 작성해보세요.
 * 입력: 첫 번째 줄에 정수 A,B가 공백을 사이에 두고 주어집니다.
 * 제한 조건: 1 <= A <= B <= 100
 * 출력: 첫 번째 줄에 B부터 시작하여 A까지 1씩 감소하도록 수들을 공백을 사이에 두고 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 2 5
 *
 * 출력
 * 5 4 3 2
 *
 * 예제 2
 * 입력
 * 5 5
 *
 * 출력
 * 5
 */

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A < 1 || A > B || B > 100) {
            System.out.println("Invalid input");
            return;
        }
        for(int i = 0; i <= B - A; i++) {
            System.out.print(B - i + " ");
        }
    }
}
