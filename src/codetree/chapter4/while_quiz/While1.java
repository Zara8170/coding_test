package codetree.chapter4.while_quiz;

/**
 * 2 이상 1000000 이하의 두 정수 N, M이 주어집니다.
 * N이 0이 되기 전까지 N을 계속 M으로 나눕니다.
 * 다음의 과정을 반복합니다.
 * 1. 현재의 N값을 출력합니다.
 * 2. N을 M으로 나눈 몫(소수점 아래는 버림)으로 N을 갱신합니다.
 * 위 과정을 수행하는 프로그램을 작성하세요.
 * 입력: 첫째 줄에 N,M이 공백으로 구분되어 주어집니다.
 * 제한 조건: 2 <= N,M <= 1000000
 * 출력: 초기 N부터 0이 되기 전까지 계속 M으로 나눈 결과를 한 줄에 하나씩 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 100 5
 *
 * 출력
 * 100
 * 20
 * 4
 *
 * 예제 2
 * 입력
 * 50 2
 *
 * 출력
 * 50
 * 25
 * 12
 * 6
 * 3
 * 1
 *
 * 예제3
 * 입력
 * 5 10
 *
 * 출력
 * 5
 */

//public class While1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        if((N < 2 || N > 1000000) || (M < 2 || M > 1000000)) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        System.out.println(N);
//
//        while((N / M) > 0) {
//            System.out.println(N /= M);
//        }
//    }
//}

//public class While1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        while(N > 0){
//            System.out.println(N);
//            N /= M;
//        }
//    }
//}

import java.util.*;
import java.io.*;

public class While1 {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 입력 받고 공백 기준으로 나눔
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 번째 숫자: N (시작 값)
        int N = Integer.parseInt(st.nextToken());
        // 두 번째 숫자: M (나눌 값)
        int M = Integer.parseInt(st.nextToken());

        // 문자열 누적을 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        // N이 0보다 큰 동안 반복
        while(N > 0){
            // 현재 N 값을 sb에 추가하고 줄바꿈
            sb.append(N).append("\n");

            // N을 M으로 나눔 (몫만 저장)
            N /= M;
        }

        // 누적된 출력 결과를 한 번에 출력
        System.out.print(sb);
    }
}




