package codetree.chapter6.array_quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 10 미만의 정수 두 개가 주어지면 순서대로 첫 번쨰, 두 번째 항으로 설정한 후 세 번째 항부터는 전전항과 전항의 합을 구하여 그 합의
 * 1의 자리로 채워서 차례로 10개를 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번쨰 줄에 첫째항, 둘째항이 공백을 사이에 두고 주어집니다.
 *
 * 제한 조건
 * 0 <= 주어지는 정수 <= 9
 *
 * 출력
 * 첫 번째 줄에 숫자들을 공백을 사이에 두고 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 2 5
 *
 * 출력
 * 2 5 7 2 9 1 0 1 1 2
 */

//public class Array4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int [] arr = new int[10];
//        arr[0] = a;
//        arr[1] = b;
//        for(int i=2; i<10; i++){
//            arr[i] = (arr[i-2] + arr[i-1]) % 10;
//        }
//        for(int i=0; i<10; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

//import java.util.*;
//
//public class Array4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(x);
//        list.add(y);
//
//        int z;
//        for(int i = 2; i < 10; i++){
//            z = (list.get(i-2) + list.get(i-1)) % 10;
//            list.add(z);
//        }
//
//        for(int i : list) {
//            System.out.print(i + " ");
//        }
//    }
//}

public class Array4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] numbers = new int[10];
        numbers[0] = Integer.parseInt(input[0]);
        numbers[1] = Integer.parseInt(input[1]);

        for(int i=2; i<numbers.length; i++){
            numbers[i] = numbers[i-1] + numbers[i-2];

            if(numbers[i] >= 10){
                numbers[i] %= 10;
            }
        }

        for(int num : numbers){
            System.out.print(num+" ");
        }
    }
}


