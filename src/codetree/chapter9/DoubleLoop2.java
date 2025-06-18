package codetree.chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정수 N의 값을 입력받아 별표를 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.
 * 예)
 * N에 2를 입력 받는 경우
 *  * *
 *  *
 * N에 3을 입력받는 경우
 *  * * *
 *  * *
 *  *
 *
 * 입력
 * 첫 번째 줄에 N이 주어접니다.
 *
 * 제한 조건
 * 1 <= N <= 10
 *
 * 출력
 * 주어지는 N의 값에 따른 별표를 입출력 예제와 같이 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 5
 *
 * 출력
 *  * * * * *
 *  * * * *
 *  * * *
 *  * *
 *  *
 */

public class DoubleLoop2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
