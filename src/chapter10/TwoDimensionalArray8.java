package chapter10;

import java.util.Scanner;

/**
 * 정수 N의 값이 주어지면 N값에 따라 1에서 N까지의 정수들을 상하로 반복하며 출력하는 프로그램을 작성해보세요.
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
 * 예제 1
 * 입력
 * 4
 *
 * 출력
 * 1414
 * 2323
 * 3232
 * 4141
 *
 * 예제 2
 * 입력
 * 5
 *
 * 출력
 * 15151
 * 24242
 * 33333
 * 42424
 * 51515
 *
 */

public class TwoDimensionalArray8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int base = i + 1;
            int alt = (n - i);

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(base);
                } else {
                    System.out.print(alt);
                }
            }
            System.out.println();
        }

    }
}

//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if (j % 2 == 0) {
//                    System.out.print(i + 1);
//                } else {
//                    System.out.print(N - i);
//                }
//            }
//            System.out.println();
//        }
//    }
//}
