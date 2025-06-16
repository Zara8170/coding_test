package chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 두 정수 start와 end가 주어집니다.
 * 정수의 약수란, 그 수를 나누었을 때 나머지가 없이 떨어지는 양의 정수를 뜻합니다. 예를 들어, 6의 약수는 1,2,3,6으로 총 네 개입니다.
 * start이상 end이하인 정수 중에서, 약수가 정확하게 세 개인 수의 개수를 구하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 줄에 두 정수 start와 end가 공백으로 구분되어 주어집니다.
 *
 * 제한조건
 * 1 <= start <= end <= 1000
 *
 * 출력
 * 첫 줄에 조건을 만족하는 정수의 개수를 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 3 7
 *
 * 출력
 * 1
 *
 * 예제 2
 * 입력
 * 9 16
 *
 * 출력
 * 1
 *
 * 입력
 * 1 50
 *
 * 출력
 * 4
 */

//public class RepeatTheLoop2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int start = Integer.parseInt(st.nextToken());
//        int end = Integer.parseInt(st.nextToken());
//
//        int count = 0;
//
//        for(int i = start; i <= end; i++) {
//            int sqrt = (int) Math.sqrt(i);
//            if(sqrt * sqrt == i && isPrime(sqrt)) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }
//
//    public static boolean isPrime(int n) {
//        if (n < 2) return false;
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if(n % i == 0) return false;
//        }
//
//        return true;
//    }
//}

//import java.util.Scanner;
//
//public class RepeatTheLoop2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 변수 선언 및 입력
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        int answer_cnt = 0;
//
//        for(int curr_num = start; curr_num <= end; curr_num++) {
//            // Step 1:
//            int divisor_cnt = 0;
//            for(int divisor = 1; divisor <= curr_num; divisor++){
//                if(curr_num % divisor == 0){
//                    divisor_cnt++;
//                }
//            }
//            // Case 1:
//            if(divisor_cnt == 3){
//                answer_cnt++;
//            }
//        }
//
//        System.out.println(answer_cnt);
//    }
//}

public class RepeatTheLoop2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int count = 0;

        for(int i = start; i <= end; i++) {
            int divisor_count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    divisor_count++;
                }
            }

            if(divisor_count == 3) {
                count++;
            }
        }

        System.out.println(count);
    }
}
