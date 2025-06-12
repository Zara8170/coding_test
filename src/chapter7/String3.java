package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 문자열이 주어지면, 앞에서 2번째 원소와 뒤에서 2번째 원소를 문자 'a'로 대체한 이후의 문자열을 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 길이가 10 이상이고, 100이하인 문자열이 주어집니다.
 *
 * 제한 조건
 * 10 <= 문자열의 길이 <= 100
 *
 * 출력
 * 첫 번째 줄에 해당하는 문자열을 출력합니다.
 *
 * 입력 예제
 * 입력
 * leebroscode
 *
 * 출력
 * laebroscoae
 *
 * 예제 2
 * 입력
 * aaaaaaaaaaaaaaa
 *
 * 출력
 * aaaaaaaaaaaaaaa
 */

//public class String3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        StringBuilder sb = new StringBuilder(input);
//
//        sb.setCharAt(1, 'a');
//        sb.setCharAt(sb.length() - 2, 'a');
//
//        System.out.println(sb.toString());
//
//    }
//}

public class String3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder(input);

        // 앞에서 두 번째 문자 변경
        sb.setCharAt(1, 'a');

        // 뒤에서 두 번째 문자 변경
        sb.setCharAt(sb.length() - 2, 'a');

        System.out.println(sb.toString());
    }
}

