package chapter10;

import java.util.Scanner;

/**
 * 4 x 4 크기의 격자에 정수가 하나씩 주어져있습니다. 이 정수들 중 다음 그림에서 색칠된 칸들에 해당하는 정수의 합을 2차원 배ㅕㅇㄹ을 통해 구하는 프로그램을 작성해보세요.
 *
 * ■□□□
 * ■■□□
 * ■■■□
 * ■■■■
 *
 * 입력
 * 첫 번쨰 줄부터 4개의 줄에 걸쳐, 한 줄에 4개씩 정수가 공백을 두고 주어집니다.
 *
 * 제한 조건
 * 1 <= 주어지는 정수 <= 100
 *
 * 출력
 * 첫 번째 줄에 색칠된 칸에 해당하는 정수들의 합을 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 3 3 54 5
 * 2 6 7 81
 * 3 31 2 1
 * 95 5 7 1
 *
 * 출력
 * 155
 */

public class TwoDimensionalArray6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j < i + 1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);

    }
}
