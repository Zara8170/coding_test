package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 정수 N이 주어졌을 때, 1부터 차례대로 100까지 1씩 증가시키며 합을 구하다가 처음으로 그 합이 N 이상이 되는 순간에 더해진 수가 무엇인지를 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 N의 값이 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 5000
 *
 * 출력
 * 첫 번째 줄에는 1부터 증가시키며 더한 값이 N 이상이 되는 순간 더해진 수를 출력합니다.
 *
 * 입력 예제
 * 예제1
 * 입력
 * 5
 *
 * 출력
 * 3
 */

//public class Test4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int total = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            total += i;
//            if(total >= n) {
//                System.out.println(i);
//                break;
//            } else {
//                continue;
//            }
//        }
//    }
//}

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 1; i <= 100; i++) {
            total += i;
            if(total >= n) {
                System.out.println(i);
                break;
            } else {
                continue;
            }
        }
    }
}
