package codetree.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 3행 3열의 배열 두 개가 주어지면 두 배열의 같은 위치에 있는 수의 곱을 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 3행 3열의 배열 두 개가 줄 간경르 사이에 두고 주어집니다.
 * 1 <= 배열 요소 범위 <= 100
 *
 * 출력
 * 주어진 두 배열의 곱을 3행 3열의 배열로 입출력 예제와 같이 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * 2 3 4
 * 5 6 7
 * 8 9 10
 *
 * 출력
 * 2 6 12
 * 20 30 42
 * 56 72 90
 */

//public class TwoDimensionalArray2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cols = 3;
//        int rows = 3;
//        int[][] arr1 = new int[rows][cols];
//        int[][] arr2 = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(arr1[i][j] * arr2[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

public class TwoDimensionalArray2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = 3;
        int cols = 3;
        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];

        // 첫 번째 배열 채우기
        for(int i = 0; i < rows; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < cols; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 빈줄 처리
        br.readLine();

        // 두 번째 배열 채우기
        for(int i = 0; i < rows; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < cols; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 곱하기
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr1[i][j] * arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
