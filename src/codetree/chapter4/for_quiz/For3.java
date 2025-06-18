package codetree.chapter4.for_quiz;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 정수 A,N이 주어졌을 때, A에 N을 더하는 과정을 N번 반복하려고 합니다.
 * 각 연산 결과값을 순서대로 출력하는 프로그램을 작성해보세요.
 *
 * 입력: 첫 번째 줄에 정수 A, N가 공백을 두고 주어집니다.
 * 제한 조건: 1 <= A,N <= 10
 * 출력: 첫 번째 줄부터 N개의 줄에 걸쳐, A에 N을 더한 결과값을 한 줄에 하나씩 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 5 6
 *
 * 출력
 * 11
 * 17
 * 23
 * 29
 * 35
 * 41
 */

//public class For3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int N = sc.nextInt();
//
//        if((A < 1 || A > 10) || (N < 1 || N > 10) ) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        for(int i = 0; i < N; i++) {
//            System.out.println(A += N);
//        }
//    }
//}

//public class For3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int N = sc.nextInt();
//
//        if((A < 1 || A > 10) || (N < 1 || N > 10) ) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        IntStream.range(1, N + 1).forEach(i -> System.out.println(A + i * N));
//    }
//}

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();

        if((A < 1 || A > 10) || (N < 1 || N > 10) ) {
            System.out.println("Invalid input");
            return;
        }

        IntStream.range(1, N + 1)
                .map(i -> A + i * N)
                .forEach(System.out::println);
    }
}
