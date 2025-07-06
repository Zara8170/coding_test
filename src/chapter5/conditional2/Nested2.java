package chapter5.conditional2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 자연수 Y를 입력받아 Y년이 윤년인지를 판단하는 프로그램을 작성해보세요. 윤년일 조건은 다음과 같습니다.
 * - 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년입니다.
 * - 단, 예외적으로 100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 합니다.
 * 입력
 * 첫 번째 줄에는 Y이 주어집니다.
 * 제한 조건: 1 <= Y <= 2222
 * 출력
 * 입력받은 연도가 윤년이라면 true를 아니라면 false를 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 2020
 *
 * 출력
 * true
 *
 * 예제 2
 * 입력
 * 2200
 *
 * 출력
 * false
 */

//public class Nested2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int Y = Integer.parseInt(br.readLine());
//
//        if ((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//        if(Y % 4 == 0) {
//            if(Y % 100 != 0 || Y % 400 == 0) {
//                System.out.println("true");
//            } else {
//                System.out.println("false");
//            }
//        } else {
//            System.out.println("false");
//        }
//    }
//}

public class Nested2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Y = Integer.parseInt(br.readLine());

        if(Y % 100 == 0 && Y % 400 != 0){
            System.out.println("false");
        }
        else if (Y % 4 == 0) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
