package chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * l ์ N๊ณผ M์ ๊ฐ์ ์๋ ฅ๋ฐ์ ๋ณํ๋ก ์ด๋ฃจ์ด์ง ์ง์ฌ๊ฐํ์ ์ถ๋ ฅํ๋ ํ๋ก๊7ธ๋จ์ ์๋ ์๋ฅผ ์ฐธ๊ณ ํlฌ ์์ฑํด๋ณด์ธ์.
 * ์)
 * N์ 3์ M์ 5๋ฅผ ์๋ ฅ๋0๋ ๊ฒฝ์ฐ
 *    * * * * *
 *    * * * * *
 *    * * * * *
 *
 * ์๋ ฅ
 * ์ฒซ ๋ฒ์งธ ์ค์ ์ธ๋ก๋ณ์ ๊ธธ์ด N๊ณผ, ๊0๋ก๋ณ์ ๊ธธ์ด M์ด ๊ณต๋ฐฑ์ ์ฌ์ด์ ๋๊ณ  ์ฃผ์ด์ง๋๋ค.
 *
 * ์ ํ ์กฐ๊ฑด
 * 1 <= N, M <= 9
 *
 * ์ถ๋ ฅ
 * lฃผ์ด์ง๋ N๊ณผ M์ ๊ฐ์ ๋0๋ฅธ ๋ณํ๋ฅผ ์์ถ๋ ฅ ์์ ์ ๊ฐ์ด ์ถ๋ ฅํฉ๋๋ค.
 *
 * ์๋ ฅ ์์ 
 * ์์  1
 * ์๋ ฅ
 * 4 2
 *
 * ์ถ๋ ฅ
 *  * *
 *  * *
 *  * *
 *  * *
 */

public class DoubleLoop1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
