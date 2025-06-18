package codetree.chapter4.for_quiz;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 정수 N의 값을 입력받고 그 값의 횟수만큼 LeebrosCode를 출력하는 프로그램을 작성해보세요.
 * 입력: 첫 번째 줄에 정수 N이 주어집니다.
 * 제한 조건: 1 <= N <= 10
 * 출력: 입력받은 값의 횟수만큼 LeebrosCode를 줄에 한 번씩 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력 6
 *
 * 출력
 * LeebrosCode
 * LeebrosCode
 * LeebrosCode
 * LeebrosCode
 * LeebrosCode
 * LeebrosCode
 */

//public class For2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for(int i = 0; i < N; i++) {
//            System.out.println("LeebrosCode");
//        }
//    }
//}

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        IntStream.range(0, N).forEach(i -> System.out.println("LeebrosCode"));
    }
}
