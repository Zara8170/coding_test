package chapter3.elseIf_quiz;

import java.util.Scanner;

/**
 * N만큼의 돈으로 살 수 있는 물건 중 가장 비싼 물건을 출력하는 프로그램을 작성해보세요.
 * 물건 가격
 * book 3000
 * mask 1000
 *
 * 입력: 첫 번째 줄에 가지고 있는 돈 n이 주어집니다.
 * 제한 조건: 0 <= N <= 10000
 * 출력: 첫 번째 줄에 살 수 있는 가장 비싼 물건의 이름을 출력합니다. 만약, 아무것도 살 수 없다면 no를 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 3000
 *
 * 출력
 * book
 * 예제 2
 * 입력
 * 1000
 *
 * 출력
 * mask
 *
 * 예제 3
 * 입력
 * 0
 *
 * 출력
 * no
 */

public class ElseIf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 0 || N > 10000) {
            System.out.println("Invalid Input");
            return;
        }

        if(N >= 3000) {
            System.out.println("book");
        } else if(N >= 1000) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}
