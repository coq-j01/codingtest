package src;

import java.util.Scanner;

// 12865번 배낭
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //물건의 개수 N
        int K = sc.nextInt(); //버틸 수 있는 무게
        int[] W = new int[N];
        int[] V = new int[N];
        int max=0;
        for( int i=0; i<N; i++){
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }
        // DP 배열 : 최대 무게 K까지의 최적 가치 저장
        int[] dp = new int[K + 1];

        for (int i = 0; i < N; i++) {
            // 무게를 뒤에서부터 갱신 (거꾸로 순회)
            for (int w = K; w >= W[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - W[i]] + V[i]);
            }
        }
        System.out.println(dp[K]);
    }
}
