package chapter10;

import java.util.Scanner;

/**
 * 정수 N의 값이 주어지면 N값에 따라 일의 자리 숫자를 좌우로 반복하며 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 N이 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 9
 *
 * 출력
 * N의 값에 따른 숫자들을 입출력 예제와 같이 출력합니다.
 *
 * 입력 예제
 * 입력
 * 4
 *
 * 출력
 * 1234
 * 4321
 * 1234
 * 4321
 *
 * 예제 2
 * 입력
 * 5
 * 출력
 * 12345
 * 54321
 * 12345
 * 54321
 * 12345
 */

public class TwoDimensionalArray7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i % 2 == 0) {
                    System.out.print(cnt);
                    if(j == n - 1) {
                        continue;
                    }
                    cnt++;
                } else {
                    System.out.print(cnt);
                    if(j == n - 1) {
                        continue;
                    }
                    cnt--;
                }
            }
            System.out.println();
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if (i % 2 == 0) {
//                    System.out.print(j + 1);
//                } else {
//                    System.out.print(N - j);
//                }
//            }
//            System.out.println();
//        }
//    }
//}
