package baekjoon.repeat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Repeat6 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line; // 여기서 br.readLine()을 선언하고 한번만 입력받고 while문만 계속 도는 상황 발생
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                break;
            }

            StringTokenizer st = new StringTokenizer(line, " ");
            if (st.countTokens() < 2) {
                continue;
            }

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n");
        }

        System.out.print(sb);
    }
}

