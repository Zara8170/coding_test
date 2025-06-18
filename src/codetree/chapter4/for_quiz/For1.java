package codetree.chapter4.for_quiz;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 문자를 입력받아서 8회 출력하는 프로그램을 작성해보세요.
 * 입력: 첫 번쨰 줄에 문자를 입력받습니다.
 * 출력: 입력받은 문자를 사이에 공백없이 8회 출력합니다.
 * 입력 예제
 * 예제1
 * 입력
 * G
 *
 * 출력
 * GGGGGGGG
 */

//public class For1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        for(int i = 0; i < 8; i++) {
//            System.out.print(input);
//        }
//    }
//}

public class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        IntStream.range(0, 8).forEach(i -> System.out.print(input));
    }
}