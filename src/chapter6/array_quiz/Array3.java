package chapter6.array_quiz;

/**
 * N개의 원소가 주어졌을 때, 주어진 N개의 원소에 각각 제곱을 하여 출력하는 프로그램을 작성해보세요.
 * 입력
 * 첫 번째 줄에 원소의 개수를 나타내는 N이 주어집니다. 두 번째 줄에는 N개의 원소가 공백을 사이에 두고 주어집니다.
 * 제한 조건
 * 1 <= N <= 100
 * 1 <= 주어지는 수 <= 100
 * 출력
 * 첫 번째 줄에 N개의 원소에 각각 제곱을 한 결과를 공백을 사이에 두고 입력받은 순서대로 출력합니다.
 * 입력 예제
 * 예제 1
 * 3
 * 1 8 5
 *
 * 출력
 * 1 64 25
 *
 * 예제 2
 * 입력
 * 2
 * 10 4
 *
 * 출력
 * 100 16
 */

//public class Array3 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//
//        int[] numbers = Arrays.stream(br.readLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .map(x -> x * x)
//                .toArray();
//
//        for (int i = 0; i < N; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}

//public class Array3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for(int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//            System.out.print(arr[i] * arr[i] + " ");
//        }
//    }
//}

import java.io.*;

public class Array3 {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int[] numbers = new int[inputs.length];

        for(int i=0; i<inputs.length; i++){
            numbers[i] = Integer.parseInt(inputs[i]);
            numbers[i] *= numbers[i];
            System.out.print(numbers[i]+" ");
        }
    }
}

