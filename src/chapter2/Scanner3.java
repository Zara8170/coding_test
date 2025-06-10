package chapter2;

import java.util.Scanner;

/**
 * 실수값 N을 하나 입력받아 소수점 둘째자리까지 반올림하여 출력하는 프로그램을 작성해주세요.
 *
 * 입력: 첫 번째 줄에는 N이 주어집니다.
 * 제한 조건: 0 <= N <= 50
 * 출력: 입력받은 실수값을 소수점 둘째자리까지 반올림하여 출력합니다.
 * 입력 예제:
 * 예제 1
 * 입력: 22.4567
 * 출력: 22.46
 * 예제 2
 * 입력: 15
 * 출력: 15.00
 */

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();

        if(N < 0 || N > 50) {
            System.out.println("Invalid input");
            return;
        }

        // 포맷 함수 printf or String.format 사용해야 함
        System.out.printf("%.2f\n", N);
    }
}
