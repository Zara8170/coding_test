package codetree.chapter5.conditional;

import java.util.Scanner;

/**
 * 정수 a를 입력받았을 때 13의 배수이거나 19의 배수인 경우는 True, 그 외의 경우는 False를 출력하는 프로그램을 작성해주세요.
 * 입력: 첫 번째 줄에 정수 a가 주어집니다.
 * 제한 조건: 1 <= a <= 1,000
 * 출력: 첫 번째 줄에는 a에 따른 경우의 값을 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 361
 *
 * 출력
 * True
 *
 * 예제 2
 * 입력
 * 100
 *
 * 출력
 * False
 */

public class ConditionQuiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 1 || a > 1000) {
            System.out.println("Invalid input");
            return;
        }

        if (a % 13 == 0 || a % 19 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

//import java.io.*;
//        import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        System.out.print(a % 13 == 0 || a % 19 == 0 ? "True" : "False");
//    }
//}

