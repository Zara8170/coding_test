import java.util.Scanner;

/*
 * 코딩테스트 문제: 계단 오르기
 * 
 * 문제 설명:
 * 계단을 오르는데, 한 번에 1칸 또는 2칸씩 오를 수 있습니다.
 * n개의 계단을 오르는 방법의 수를 구하세요.
 * 
 * 입력:
 * 첫 번째 줄에 계단의 개수 n이 주어집니다. (1 ≤ n ≤ 45)
 * 
 * 출력:
 * n개의 계단을 오르는 방법의 수를 출력하세요.
 * 
 * 예시:
 * 입력: 3
 * 출력: 3
 * 
 * 설명: 3개 계단을 오르는 방법
 * 1) 1칸 + 1칸 + 1칸
 * 2) 1칸 + 2칸
 * 3) 2칸 + 1칸
 * 
 * 힌트: 피보나치 수열과 유사한 패턴입니다!
 */

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 여기에 코드를 작성하세요!
        // TODO: n을 입력받고, 계단을 오르는 방법의 수를 계산하여 출력하세요
        
        int[] dp = new int[46];
        dp[1] = 1;
        dp[2] = 2;
        int n = sc.nextInt();
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
        
        // 여러분의 해답을 작성해보세요!
        // 동적 프로그래밍이나 재귀를 사용해볼 수 있습니다.
        
        sc.close();
    }
}