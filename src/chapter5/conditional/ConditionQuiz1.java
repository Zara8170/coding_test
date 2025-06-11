package chapter5.conditional;

import java.util.Scanner;

/**
 * A와 B의 수학과 영어의 점수를 입력받아 누가 더 높은지 비교하는 프로그램을 작성해주세요.
 * 입력
 * 첫번째 줄에 A의 수학과 영어점수가 공백을 사이에 두고 주어집니다.
 * 두번째 줄에 B의 수학과 영어점수가 공백을 사이에 두고 주어집니다.
 * 제한 조건: 1 <= 입력으로 주어지는 점수 <= 100
 * 출력
 * A가 B보다 수학의 점수도 크고 영어의 점수도 크면 1, 그렇지 않으면 0을 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 100 85
 * 98 78
 *
 * 출력
 * 1
 * 예제2
 * 입력
 * 86 93
 * 86 90
 *
 * 출력
 * 0
 */

public class ConditionQuiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ma = sc.nextInt();
        int ea = sc.nextInt();
        int mb = sc.nextInt();
        int eb = sc.nextInt();

        if (ma > mb && ea > eb) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

//import java.io.*;
//        import java.util.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int A_math = Integer.parseInt(st.nextToken());
//        int A_eng = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int B_math = Integer.parseInt(st.nextToken());
//        int B_eng = Integer.parseInt(st.nextToken());
//        System.out.print((A_math > B_math) && (A_eng > B_eng) ? 1 : 0);
//    }
//}

