package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * N x M 크기의 2차원 격자가 두 개 주어지고, 새로운 2차원 격자를 만들려고 합니다.
 * 주어진 두 격자에서 같은 위치에 존재하는 수의 값이 같다면 0, 그렇지 않다면 1을 적어주려 합니다.
 * 새로운 2차원 격자를 만들어 이를 해결하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 격자의 행의 개수 N과, 열의 개수 M이 공백을 두고 주어집니다.
 * 두 번째 줄부터 N개의 줄에 걸쳐 첫 번째 N x M 크기의 격자가 주어집니다.
 * N + 2 번째 줄부터 n개의 줄에 걸쳐 두 번쨰 N x M 크기의 격자가 주어집니다.
 *
 * 제한 조건
 * 1 <= N, M <= 10
 * 1 <= 주어지는 수 <= 10
 *
 * 출력
 * 첫 번째 줄부터 N개의 줄에 걸쳐 새롭게 만든 격자를 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 4 4
 * 1 4 5 2
 * 3 3 5 2
 * 3 6 2 1
 * 6 2 5 4
 * 3 4 5 2
 * 3 3 2 2
 * 3 6 2 1
 * 6 3 5 4
 *
 * 출력
 * 1 0 0 0
 * 0 0 1 0
 * 0 0 0 0
 * 0 1 0 0
 */

//public class TwoDimensionalArray3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr1 = new int[n][m];
//        int[][] arr2 = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(arr1[i][j] != arr2[i][j]) {
//                    System.out.print(1 + " ");
//                } else {
//                    System.out.print(0 + " ");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//}


public class TwoDimensionalArray3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr1[i][j] != arr2[i][j]) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }
}