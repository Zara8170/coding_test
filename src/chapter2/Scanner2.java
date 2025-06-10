package chapter2;

import java.util.Scanner;

/**
 * 정수 a를 입력받고, a에 2를 더해준 값을 출력하는 프로그램을 작성해보세요.
 *
 * 입력: 첫 번째 줄에 정수 a가 주어집니다.
 * 제한 조건: 1 <= a <= 100
 * 출력: 첫 번째 줄에는 계산 후의 정수 a를 출력합니다.
 * 입력 예제:
 * 예제 1
 * 입력: 18
 * 출력: 20
 */


public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 1 || a > 100) {
            System.out.println("a must be between 1 and 100");
            return;
        }

        System.out.println(a + 2);
    }
}
