package codetree.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 시험점수에 따라 등급을 정합니다.
 * - 90점 이상이면 A,
 * - 80점 이상이면 B,
 * - 70점 이상이면 C,
 * - 60점 이상이면 D,
 * - 60점 미만이면 F 라고 합니다.
 * 주어지는 점수 N부터 100점까지 1점씩 증가하며 각 점수가 어떤 등급에 해당하는지 출력하는 프로그램을 작성해보세요.
 *
 * 입력
 * 첫 번째 줄에 N의 값이 주어집니다.
 *
 * 제한 조건
 * 0 <= N <= 100
 *
 * 출력
 * 첫 번째 줄에 주어지는 점수 N부터 100점까지 각 점수의 등급을 순서대로 공백을 사이에 두고 출력합니다.
 *
 * 입력 예제
 * 예제 1
 * 입력
 * 85
 *
 * 출력
 * B B B B B A A A A A A A A A A A
 *
 * 예제 2
 * 입력
 * 94
 *
 * 출력
 * A A A A A A A
 */

//public class Test1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        while (N <= 100) {
//            if(N >= 90) {
//                System.out.print("A" + " ");
//                N++;
//            } else if(N >= 80) {
//                System.out.print("B" + " ");
//                N++;
//            } else if(N >= 70) {
//                System.out.print("C" + " ");
//                N++;
//            } else if(N >= 60) {
//                System.out.print("D" + " ");
//                N++;
//            } else {
//                System.out.print("F" + " ");
//                N++;
//            }
//        }
//    }
//}

//public class Test1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        while (N <= 100) {
//            switch (N / 10) {
//                case 10:
//                case 9:
//                    System.out.print("A ");
//                    break;
//                case 8:
//                    System.out.print("B ");
//                    break;
//                case 7:
//                    System.out.print("C ");
//                    break;
//                case 6:
//                    System.out.print("D ");
//                    break;
//                default:
//                    System.out.print("F ");
//                    break;
//            }
//            N++;
//        }
//    }
//}

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while(N <= 100) {
            switch(N / 10) {
                case 10:
                case 9:
                    System.out.print("A ");
                    break;
                case 8:
                    System.out.print("B ");
                    break;
                case 7:
                    System.out.print("C ");
                    break;
                case 6:
                    System.out.print("D ");
                    break;
                default:
                    System.out.print("F ");
                    break;
            }
            N++;
        }
    }
}

