package codetree.chapter5.conditional2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 3개의 정수 A,B,C를 입력받았을 때, 중앙값을 구하는 프로그램을 작성해보세요.
 * 중앙값이란, 오름차순으로 나열했을 때 중앙에 오는 값입니다.
 * 입력
 * 첫 번째 줄에 정수 A,B,C가 공백을 두고 주어집니다.
 * 제한 조건
 * -100 <= A,B,C <= 100
 * A,B,C는 서로 다릅니다.
 * 출력
 * 첫 번째 줄에 A,B,C의 값들 중 중앙값을 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 26 22 30
 *
 * 출력
 * 26
 *
 * 예제 2
 * 입력
 * -20 0 23
 *
 * 출력
 * 0
 */

//public class Nested3 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] parts = br.readLine().split(" ");
//        int A = Integer.parseInt(parts[0]);
//        int B = Integer.parseInt(parts[1]);
//        int C = Integer.parseInt(parts[2]);
//
//        if((A < -100 || B < -100 || C < -100) || (A > 100 || B > 100 || C > 100)){
//            if(A == B || A == C || B == C) {
//                System.out.println("Invalid value");
//                return;
//            }
//        }
//
//        if((A < B && A > C) || (A < C && A > B) ) {
//            System.out.println(A);
//        } else if((A > B && B > C) || (A < B && B < C)) {
//            System.out.println(B);
//        } else {
//            System.out.println(C);
//        }
//    }
//}

public class Nested3 {
    static int[] num;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        num = new int[3];

        num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());
        num[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(num);

        System.out.println(num[1]);
    }
}

