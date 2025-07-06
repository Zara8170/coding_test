package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 10개의 수가 주어졌을 때, 3의 배수의 개수와 5의 배수의 개수를 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 입력으로 10개의 수가 한 줄에 하나씩 주어집니다.
 *
 * 제한 조건
 * 1 <= 주어지는 수 <= 100
 *
 * 출력
 * 첫 번째 줄에 3과 5의 배수의 개수를 공백을 사이에 두고 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 7
 * 42
 * 10
 * 54
 * 34
 * 55
 * 57
 * 60
 * 30
 * 50
 *
 * 출력
 * 5 5
 */


// public class Test6 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        int three_cnt = 0;
//        int five_cnt = 0;
//
//         for (int i = 0; i < 10; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i < 10; i++) {
//            if(arr[i] % 3 == 0 && arr[i] % 5 == 0) {
//                three_cnt++;
//                five_cnt++;
//            }
//            else if(arr[i] % 3 == 0) {
//                three_cnt++;
//            } else if(arr[i] % 5 == 0) {
//                five_cnt++;
//            }
//        }

//        System.out.print(three_cnt + " " + five_cnt);
//    }
// }

public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int three_cnt = 0;
        int five_cnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < 10; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                three_cnt++;
                five_cnt++;
            }
            else if(arr[i] % 3 == 0) {
                three_cnt++;
            } else if(arr[i] % 5 == 0) {
                five_cnt++;
            }
        }

        System.out.print(three_cnt + " " + five_cnt);
    }
}