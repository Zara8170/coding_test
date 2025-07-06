package chapter4.for_quiz2;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 자연수 N을 입력받아 N보다 크거나 같은 N의 배수 중 작은 수 5개를 차례로 출력하는 프로그램을 작성해보세요.
 * 입력: 첫 번쨰 줄에 자연수 N을 입력받습니다.
 * 제한 조건: 1 <= N <= 100
 * 출력: 첫 번째 줄에 자연수 N의 배수 5개를 작은 수부터 차례로 입출력 예제와 같이 공백을 사이에 두고 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 7
 *
 * 출력
 * 7 14 21 28 35
 *
 * 예제 2
 * 입력
 * 4
 *
 * 출력
 * 4 8 12 16 20
 */

//public class For2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for(int i = 1; i < 6; i++) {
//            System.out.print(N * i + " ");
//        }
//    }
//}

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        IntStream.range(1, 6)
                .forEach(i -> System.out.print(N * i + " "));
    }
}
