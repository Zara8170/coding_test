package codetree.chapter5.conditional2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 성별에 대해 남자는 숫자 0, 여자는 숫자 1로 나타내기로 하고, 19세 이상을 성인이라고 합시다.
 * 성별(숫자 0 또는 1)과 나이를 입력받아 MAN(성인남자), WOMAN(성인여자), BOY(미성년남자), GIRL(미성년여자)을 구분하여 출력하는 프로그램을 작성해주세요.
 * 입력
 * 첫 번째 줄에 성별에 해당하는 숫자가 주어지고,
 * 두 번째 줄에는 나이가 자연수로 주어집니다.
 * 제한 조건: 1 <= 나이 <= 100
 *
 * 출력
 * 나이와 성별에 해당하는 문자를 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * 0
 * 23
 *
 * 출력
 * MAN
 *
 * 예제 2
 * 입력
 * 1
 * 13
 *
 * 출력
 * GIRL
 */

//public class Nested1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int gender = sc.nextInt();
//        int age = sc.nextInt();
//
//        if(gender == 0) {
//            if(age >= 19) {
//                System.out.println("MAN");
//            } else {
//                System.out.println("BOY");
//            }
//        } else if (gender == 1) {
//            if(age >= 19) {
//                System.out.println("WOMAN");
//            } else {
//                System.out.println("GIRL");
//            }
//        }
//    }
//}

public class Nested1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int gender = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        if(gender == 0){
            if(age >= 19){
                System.out.println("MAN");
            }
            else{
                System.out.println("BOY");
            }
        }
        else{
            if(age >= 19){
                System.out.println("WOMAN");
            }
            else{
                System.out.println("GIRL");
            }
        }
    }
}

