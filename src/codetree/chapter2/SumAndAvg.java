package codetree.chapter2;

import java.util.Scanner;

/**
 * 세 개의 정수가 주어졌을 때, 세 정수의 합과 평균을 구하고, 합에서 평균을 뺀 값을 구하는 프로그램을 작성해보세요.
 * 입력: 첫 번째 줄에 세 정수 a,b,c가 공백을 두고 주어집니다. 단, a,b,c의 합은 3의 배수임을 가정하여도 좋습니다.
 * 제한 조건: 1 <= a,b,c <= 100
 * 출력
 * 첫 번째 줄에는 합을 출력합니다.
 * 두 번째 줄에는 평균을 출력합니다.
 * 세 번째 줄에는 합에서 평균을 뺀 값을 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 10 3 5
 *
 * 출력 18
 * 6
 * 12
 */

public class SumAndAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a < 1 || a > 100) || (b < 1 || b > 100) || (c < 1 || c > 100)) {
            System.out.println("Invalid input");
            return;
        }

        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum - avg);
    }
}
