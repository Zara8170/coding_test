package chapter4.for_quiz2;

import java.util.stream.IntStream;

/**
 * 5부터 17까지 출력하는 프로그램을 작성해보세요
 * 입력: 입력이 주어지지 않습니다.
 * 출력: 첫 번째 줄에 5부터 17까지 공백을 사이에 두고 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 *
 * 출력
 * 5 6 7 8 9 10 11 12 13 14 15 16 17
 */

//public class For1 {
//    public static void main(String[] args) {
//
//        for(int i = 5; i < 18; i++) {
//            System.out.print(i + " ");
//        }
//    }
//}

public class For1 {
    public static void main(String[] args) {

        IntStream.range(5, 18)
                .forEach(i -> System.out.print(i + " "));
    }
}

