package baekjoon.test1page;


import java.io.*;

//첫번째 풀이
//public class Test1003 {
//    static StringBuilder sb = new StringBuilder();
//    static int N;
//    static int[][] cnt;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        for (int tc = 1; tc <= T; tc++) {
//            N = Integer.parseInt(br.readLine());
//            cnt = new int[N+1][2];
//            cnt[0][0] = 1;
//            cnt[0][1] = 0;
//            if (N >= 1){
//                cnt[1][0] = 0;
//                cnt[1][1] = 1;
//            }
//            for (int i=2; i<=N; i++) {
//                cnt[i][0] = cnt[i-1][0] + cnt[i-2][0];
//                cnt[i][1] = cnt[i-1][1] + cnt[i-2][1];
//            }
//            sb.append(cnt[N][0]).append(" ").append(cnt[N][1]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class Test1003 {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T --> 0){
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
        }
        System.out.println(sb);
    }

    static Integer[] fibonacci(int N) {
        if(dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
            dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
        }
        return dp[N];

    }

}