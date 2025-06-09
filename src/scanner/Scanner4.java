package scanner;

import java.util.Scanner;

/**
 * 세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 출력하는 프로그램을 작성해주세요.
 * 입력: 한 줄에 하나씩 세 실수 a,b,c가 주어집니다.
 * 제한 조건: 1 <= a,b,c <= 1000
 * 출력: 한 줄에 하나씩 세 실수를 반올림하여 소수 셋째 자리까지 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 1.1278
 * 85.21344
 * 577.999564
 *
 * 출력
 * 1.128
 * 95.213
 * 578.000
 */

public class Scanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if( a < 1 || a > 1000 || b < 1 || b > 1000 || c < 1 || c > 1000 ) {
            System.out.println("Invalid input");
            return;
        }

        System.out.printf("%.3f\n", a);
        System.out.printf("%.3f\n", b);
        System.out.printf("%.3f\n", c);
    }
}
