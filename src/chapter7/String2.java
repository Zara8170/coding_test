package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 개의 단어가 주어지면 길이가 더 긴 단어와 길이를 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 길이가 20 이하인 두 개의 단어가 공백을 사이에 두고 주어집니다.
 *
 * 제한 조건
 * 단어의 길이 <= 20
 *
 * 출력
 * 첫 번쨰 줄에 길이가 더 긴 문자열과 길이를 공백을 사이에 두고 출력합니다. 만약 두 단어의 길이가 같다면 'same'을 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * Happy Coding
 *
 * 출력
 * Coding 6
 *
 * 예제 2
 * 입력
 * Hello World
 *
 * 출력
 * same
 */

//public class String2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] words = sc.nextLine().split(" ");
//
//        String word1 = words[0];
//        String word2 = words[1];
//
//        if(word1.length() > word2.length()) {
//            System.out.println(word1 + " " + word1.length());
//        } else if (word2.length() > word1.length()) {
//            System.out.println(word2 + " " + word2.length());
//        } else {
//            System.out.println("same");
//        }
//    }
//}

public class String2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String first_word = input[0];
        String second_word = input[1];

        if(first_word.length() > second_word.length()) {
            System.out.println(first_word + " " + first_word.length());
        } else if (second_word.length() > first_word.length()) {
            System.out.println(second_word + " " + second_word.length());
        } else {
            System.out.println("same");
        }
    }
}
