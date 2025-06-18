package codetree.chapter10;

import java.util.Scanner;

/**
 * 4개의 줄에 각 줄마다 4개의 정수가 주어집니다. 줄의 합을 구하는 프로그램을 배열을 사용하여 작성해보세요.
 *
 * 입력
 * 각 줄마다 4개의 정수가 공백을 사이에 두고 주어집니다.
 *
 * 제한 조건
 * 0 <= 점수 <= 100
 *
 * 출력
 * 4개의 줄에 각 줄의 합을 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 1 2 3 4
 * 7 8 9 10
 * 11 12 13 14
 * 15 16 17 18
 *
 * 출력
 * 10
 * 34
 * 50
 * 66
 */

public class TwoDimensionalArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }

    }
}
