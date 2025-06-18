package codetree.chapter2;

import java.util.Scanner;

/**
 * 정수 a,b를 입력받고, a와 b의 위치를 교환한 후 출력하는 프로그램을 작성하세요.
 * 입력: 첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
 * 제한 조건: 1 <= a,b <= 100
 * 출력: 결과값 a와 b를 공백을 사이에 두고 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 14 5
 *
 * 출력
 * 5 14
 */

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if ((a < 0 || a > 100) || (b < 0 || b > 100)) {
            System.out.println("Invalid input");
            return;
        }

        System.out.print(b + " " + a);

    }
}
