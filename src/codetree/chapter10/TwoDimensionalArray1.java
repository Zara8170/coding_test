package codetree.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 3행 3열의 배열이 주어지면 배열의 모든 원소를 3배로 만든 뒤 배열을 그대로 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 3행 3열의 배열이 입력으로 주어집니다. 첫 번째 줄부터 세 번째 줄까지 각 배열의 값이 공백을 두고 입력으로 주어집니다.
 *
 * 제한 조건
 * 1 <= 배열 요소 범위 <= 100
 *
 * 출력
 * 연산이 완료된 후 3행 3열의 배열을 입출력 예제와 같이 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 3 2 3
 * 1 3 1
 * 1 1 1
 *
 * 출력
 * 9 6 9
 * 3 9 3
 * 3 3 3
 */

//public class TwoDimensionalArray1 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int cols = 3;
//        int rows = 3;
//        int[][] arr = new int[rows][cols];
//
//        for (int i = 0; i < cols; i++) {
//            for (int j = 0; j < rows; j++) {
//                arr[i][j] = sc.nextInt() * 3;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

public class TwoDimensionalArray1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cols = 3;
        int rows = 3;
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken()) * 3;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
