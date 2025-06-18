package codetree.chapter6.array_quiz;

import java.util.Scanner;

/**
 * 문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받습니다. 입력받은 문자들을 입력 받은 순서의 역순으로 출력하는 프로그램을 작성해보세요.
 * 입력
 * 첫 번째 줄에 10개의 문자가 공백을 사이에 두고 주어집니다.
 * 출력
 * 첫 번째 줄에 주어진 문자를 입력받은 순서의 역순으로 출력합니다.
 * 입력 예제
 * 예제 1
 * 입력
 * L E B R O S C O D E
 *
 * 출력
 * EDOCSORBEL
 */

//public class Array2 {
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StreamTokenizer st = new StreamTokenizer(br);
//
//        String result = IntStream.range(0, 10)
//                .mapToObj(i -> {
//                    try {
//                        st.nextToken();
//                        return st.sval;
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                })
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        list -> {
//                            Collections.reverse(list);
//                            return String.join("", list);
//                        }
//                ));
//
//        System.out.println(result);
//    }
//}

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];
        for(int i=0; i<10; i++){
            arr[i] = sc.next().charAt(0);
        }

        for(int i=9; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
