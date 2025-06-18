package codetree.chapter8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 5개의 문자열을 "apple, "banana", "grape", "blueberry", "orange"로 초기화 한 후, 영문자 하나가 주어졌을 때
 * 5개의 문자열들 중 세 번째나 네 번째 문자와 일치하는 문자열들을 모두 찾아내고 이러한 문자열의 개수를 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 영문자가 하나 주어집니다.
 *
 * 출력
 * 각 줄에 해당 위치에 주어진 문자가 있는 문자열을 순서대로 한 줄에 하나씩 출력하고 마지막 줄에는 조건을 만족하는 문자열의 개수를 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * a
 *
 * 출력
 * banana
 * grape
 * orange
 * 3
 *
 * 예제 2
 * 입력
 * z
 *
 * 출력
 * 0
 */

public class Test7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char ch = input.charAt(0);

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;

        for(String s : arr) {
            if (s.charAt(2) == ch || s.charAt(3) == ch) {
                System.out.println(s);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
