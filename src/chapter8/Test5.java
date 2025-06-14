package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * A,B 두 자연수를 입력받아 A부터 B까지 짝수의 합을 구해 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 정수 A,B가 공백을 사이에 두고 주어집니다.
 *
 * 제한 조건
 * 1 <= A <= B <= 100
 *
 * 출력
 * 첫 번째 줄에 A부터 B까지 짝수의 합을 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 2 5
 *
 * 출력
 * 6
 *
 * 예제 2
 * 입력
 * 5 5
 *
 * 출력
 * 0
 */

public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int total = 0;

        for(int i = a; i <= b; i++) {
            if(i % 2 == 0) {
                total += i;
            }
        }

        System.out.println(total);
    }
}
