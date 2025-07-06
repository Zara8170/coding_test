package chapter6.array_quiz;

/**
 * 배열 A를 선언하여 그 값을 [3,1,4,5,9]로 저장한 뒤, 배열 A의 1번, 3번, 4번 인덱스에 저장된 값의 합을 출력하는 프로그램을 작성해주세요.
 * 입력
 * 입력이 주어지지 않습니다.
 * 출력
 * 배열 A의 1번, 3번, 4번 인덱스에 저장된 값의 합을 출력합니다.
 * 입력 예제
 * 예제 1
 * 출력
 * 15
 */

//public class Array1 {
//    public static void main(String[] args) {
//        int[] A = new int[5];
//
//        A[0] = 3;
//        A[1] = 1;
//        A[2] = 4;
//        A[3] = 5;
//        A[4] = 9;
//
//        System.out.println(A[1] + A[3] + A[4]);
//    }
//}

public class Array1 {
    public static void main(String[] args) {
        // Please write your code here.
        int[] arr = {3, 1, 4, 5, 9};
        int sum = arr[1] + arr[3] + arr[4];
        System.out.println(sum);
    }
}
