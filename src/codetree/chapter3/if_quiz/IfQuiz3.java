package codetree.chapter3.if_quiz;

import java.util.Scanner;

/**
 * 두 정수 A,B를 입력받아 다음 조건들이 각각 참인지 거짓인지를 판단하는 프로그램을 작성해보세요.
 * - A가 B보다 같거나 큰가?
 * - A가 B보다 큰가?
 * - B가 A보다 같거나 큰가?
 * - B가 A보다 큰가?
 * - A와 B가 같은가?
 * - A와 B가 다른가?
 *
 * 입력: 첫 번째 줄에 정수 A,B가 공백을 사이에 두고 주어집니다.
 * 제한 조건: 1 <= A,B <= 100
 * 출력
 * 각각의 경우에 대해 참이라면 1을, 거짓이라면 0을 출력합니다.
 * 첫 번째 줄에는 A가 B보다 같거나 큰지,
 * 두 번쨰 줄에는 A가 B보다 큰지,
 * 세 번쨰 줄에는 B가 A보다 갇거나 큰지,
 * 네 번쨰 줄에는 B가 A보다 큰지,
 * 다섯 번쨰 줄에는 A와 B가 같은지,
 * 여섯 번쨰 줄에는 A와 B가 다른지에 대한 결과를 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 4 3
 *
 * 출력
 * 1
 * 1
 * 0
 * 0
 * 0
 * 1
 *
 * 예제2
 * 입력
 * 3 3
 *
 * 출력
 * 1
 * 0
 * 1
 * 0
 * 1
 * 0
 */

//public class IfQuiz3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//
//        if((A < 0 || A > 100) || (B < 0 || B > 100)) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        if (A >= B) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//
//        if (A > B) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//
//        if (A <= B) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//
//        if (A < B) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//
//        if (A == B) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//
//        if (A != B) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//
//        System.out.println(A >= B);
//        System.out.println(A > B);
//        System.out.println(A < B);
//        System.out.println(A <= B);
//        System.out.println(A == B);
//        System.out.println(A != B);
//    }
//}

public class IfQuiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((A < 0 || A > 100) || (B < 0 || B > 100)) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println(A >= B ? 1 : 0);
        System.out.println(A > B ? 1 : 0);
        System.out.println(A <= B ? 1 : 0);
        System.out.println(A < B ? 1 : 0);
        System.out.println(A == B ? 1 : 0);
        System.out.println(A != B ? 1 : 0);
    }
}
