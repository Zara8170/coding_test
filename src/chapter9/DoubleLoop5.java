package chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ์ ์ N์ด ์ฃผ์ด์ง๋ฉด, 1๋ถํฐ N๊น์ง์ ์์ ๋ํด, i( 1<= i <= N)๋ฒ์งธ ์ค์ i๊ฐ์ ikฅผ ์ถ๋ ฅํ๋ ํ๋ก๊ทธ๋จ์ ์์ฑํด๋ณด์ธ์.
 *
 * ์k ฅ
 * ์ฒซ ๋ฒ์งธ ์ค์ ์ ์ N์ด ์ฃผ์ด์ง๋๋ค.
 *
 * ์ ํ ์กฐ๊ฑด
 * 1 <= N <= 100
 *
 * ์ถ๋ ฅ
 * 1๋ถํฐ N๊น์ง                                i๊ฐ์ i๋ฅผ ๊ณต๋ฐฑ์ ๋๊ณ  ์ถ๋ ฅํฉ๋๋ค.
 *
 * ์๋ ฅ ์์ 
 * ์์ 1
 * ์๋ ฅ
 * 3
 *
 * ์ถ๋ ฅ
 * 1
 * 2 2
 * 3 3 3
 *
 * ์์  2
 * ์๋ ฅ
 * 8
 *
 * ์ถ๋ ฅ
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * 6 6 6 6 6 6
 * 7 7 7 7 7 7 7
 * 8 8 8 8 8 8 8 8
 */

public class DoubleLoop5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
