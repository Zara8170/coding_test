package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * N개의 정수가 주어집니다.
 * 주어진 정수 중에서 짝수만 출력하는 프로그램을 작성해보세요. 이때, 입력에서 주어진 순서의 역순으로 짝수만 출력해야 합니다.
 * 예를 들어, N = 6개의 정수가 3, 1, 4, 5, 6, 2순으로 주어졌다면, 2,6,4를 차례대로 출력해야 합니다.
 *
 * 입력
 * 첫 줄에 정수 N이 주어집니다.
 * 그다음 줄에 N 개의 정수가 차례대로 공백으로 구분되어 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 100
 * 0 <= 주어지는 정수 <= 100
 * 주어지는 N 개의 정수는 모두 다릅니다.
 * 주어지는 N 개의 정수 중 짝수가 적어도 하나 있습니다.
 *
 * 출력
 * 첫 줄에 N 개의 정수 중 짝수만, 주어진 순서의 역순으로 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 1
 * 0
 *
 * 출력
 * 0
 *
 * 예제 2
 * 입력
 * 6
 * 3 1 4 5 6 2
 *
 * 출력
 * 2 6 4
 *
 * 예제 3
 * 입력
 * 7
 * 4 6 3 8 2 1 10
 *
 * 출력
 * 10 2 8 6 4
 */

//public class Test2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        String[] parts = br.readLine().split(" ");
//        int[] input = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            input[i] = Integer.parseInt(parts[i]);
//        }
//
//        for (int i = N - 1; i >= 0; i--) {
//            if (input[i] % 2 == 0) {
//                System.out.print(input[i] + " ");
//            }
//        }
//    }
//}

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(parts[i]);
        }

        for( int i = N - 1; i >= 0; i-- ) {
            if(input[i] % 2 == 0) {
                System.out.print(input[i] + " ");
            }
        }
    }
}
