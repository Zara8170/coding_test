package chapter10;

import java.util.Scanner;

/**
 * 4행 4열의 배열이 주어지면 배열의 모든 원소 중에서 5의 배수의 개수를 출력하는 프로그램을 작성해보세요.
 *
 * 제한 조건
 * 1 <= 배열 요소 범위 <= 100
 *
 * 출력
 * 첫 번째 줄에 배열의 모든 원소 중에서 5의 배수의 개수를 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 12 18 21 15
 * 13 16 17 19
 * 10 12 14 18
 * 20 15 10 15
 *
 * 출력
 * 6
 */

public class TwoDimensionalArray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] % 5 == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
