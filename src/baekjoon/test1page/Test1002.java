package baekjoon.test1page;

/**
 * 조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
 *
 * 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
 *
 * 조규현의 좌표 (x_1, y_1)와 백승환의 좌표 (x_2, y_2)가 주어지고, 조규현이 계산한 류재명과의 거리 r_1과 백승환이 계산한 류재명과의 거리 r_2가 주어졌을 때,
 * 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수
 * T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
 * 한 줄에 공백으로 구분 된 여섯 정수
 * x_1, y_1, r_1, x_2, y_2, r_2가 주어진다.
 *
 * 출력
 * 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는
 * -1 출력한다.
 *
 * 제한
 * -10\,000 ≤ x_1, y_1, x_2, y_2 ≤ 10\,000
 * 1 ≤ r_1, r_2 ≤ 10\,000
 *
 * 예제 입력 1
 * 3
 * 0 0 13 40 0 37
 * 0 0 3 0 7 4
 * 1 1 1 1 1 5
 *
 * 예제 출력 1
 * 2
 * 1
 * 0
 */

/**
 * 이 문제는 원의 접점의 갯수를 구하는 문제로, 입출력 관련 문제다.
 * 입출력 관련 개념으로는 Scanner, BufferedReader, StringBuilder 등이 있다.
 * 원의 접점을 알기 위해선 두 점 사이의 거리를 구하는 공식과 원과 원의 위치 관계 공식을 알 필요가 있다.
 * 두 점 사이의 거리: Math.pow((Math.pow(x2 - x1), 2) + (Math.pow(y2 - y1), 2), 1/2)
 * 원과 원 사이의 관계
 * d > r1 + r2: 원과 원이 만나지 않음(접점 0개)
 * d = r1 + r2: 원과 원은 한 점에서 만남(접점 1개, 외접)
 * |r1 - r2| < d r1 + r2: 원과 원은 두 점에서 만남.(접점 2개)
 * d = |r1 - r2|: 원과 원은 한 점에서 만남.(접점 1개, 내접)
 * d < |r1 - r2|: 원과 원은 만나지 않음(접점 0개)
 */

// Scanner
// import java.util.Scanner;
//public class Test1002 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        while(T-- > 0) {
//            int x1 = sc.nextInt();
//            int y1 = sc.nextInt();
//            int r1 = sc.nextInt();
//
//            int x2 = sc.nextInt();
//            int y2 = sc.nextInt();
//            int r2 = sc.nextInt();
//
//            System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
//        }
//    }
//
//    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
//
//        int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//
//        if(x1 == x2 && y1 == y2 && r1 == r2) {
//            return -1;
//        }
//
//        else if(distance_pow > Math.pow(r1 + r2, 2)) {
//            return 0;
//        }
//
//        else if(distance_pow < Math.pow(r2 - r1, 2)) {
//            return 0;
//        }
//
//        else if(distance_pow == Math.pow(r2 - r1, 2)) {
//            return 1;
//        }
//
//        else if(distance_pow == Math.pow(r1 + r2, 2)) {
//            return 1;
//        }
//
//        else {
//            return 2;
//        }
//    }
//}

// BufferedReader
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//
//public class Test1002 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        while(T-- > 0) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//            int x1 = Integer.parseInt(st.nextToken());
//            int y1 = Integer.parseInt(st.nextToken());
//            int r1 = Integer.parseInt(st.nextToken());
//
//            int x2 = Integer.parseInt(st.nextToken());
//            int y2 = Integer.parseInt(st.nextToken());
//            int r2 = Integer.parseInt(st.nextToken());
//
//            System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
//        }
//    }
//
//    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
//
//        int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//
//        if(x1 == x2 && y1 == y2 && r1 == r2) {
//            return -1;
//        }
//
//        else if(distance_pow > Math.pow(r1 + r2, 2)) {
//            return 0;
//        }
//
//        else if(distance_pow < Math.pow(r2 - r1, 2)) {
//            return 0;
//        }
//
//        else if(distance_pow == Math.pow(r2 - r1, 2)) {
//            return 1;
//        }
//
//        else if(distance_pow == Math.pow(r1 + r2, 2)) {
//            return 1;
//        }
//
//        else {
//            return 2;
//        }
//    }
//}

// BufferedReader + StringBuilder
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(tangent_point(x1, y1, r1, x2, y2, r2)).append('\n');
        }
        System.out.println(sb);
    }

    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        else if(distance_pow > Math.pow(r1 + r2, 2)) {
            return 0;
        }

        else if(distance_pow < Math.pow(r2 - r1, 2)) {
            return 0;
        }

        else if(distance_pow == Math.pow(r2 - r1, 2)) {
            return 1;
        }

        else if(distance_pow == Math.pow(r1 + r2, 2)) {
            return 1;
        }

        else {
            return 2;
        }
    }
}