package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1이상 N이하의 정수 중 친근하지 않은 수의 개수를 출력하는 프로그램을 작성해보세요.
 * 친근한 수란 2, 3 또는 5로 나누어 떨어지는 수를 의미합니다.
 *
 * 입력
 * 첫 번째 줄에 정수 N이 주어집니다.
 *
 * 제한 조건
 * 1 <= N <= 1000
 *
 * 출력
 * 첫 번째 줄에 1이상 N이하의 수 중 친근하지 않은 수의 개수를 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입렵
 * 10
 *
 * 출력
 * 2
 */

//public class Test3 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
//                continue;
//            } else {
//                Arrays.fill(arr, i); // 배열 전체를 i로 덮어씀
//            }
//        }
//
//        System.out.println(arr.length); // arr.length는 고정 크기임.
//    }
//}

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}

// 해설
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 변수 선언
//        int n;
//        int cnt = 0;
//
//        n = sc.nextInt();
//
//        // 1부터 n까지의 수 중, 2 또는 3 또는 5로 나누어지지 않는 수의 개수를 구합니다.
//        for(int i = 1; i <= n; i++) {
//            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
//                continue;
//            cnt++;
//        }
//
//        // 출력
//        System.out.print(cnt);
//    }
//}
