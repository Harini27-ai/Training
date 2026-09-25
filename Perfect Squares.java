import java.util.Arrays;
public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int count = 1;
        while (count * count <= n) {
            int sq = count * count;
            for (int i = sq; i <= n; i++) {
                dp[i] = Math.min(dp[i - sq] + 1, dp[i]);
            }
            count++;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 12;
        System.out.println("Input: " + n1 + " | Output: " + sol.numSquares(n1));
        int n2 = 13;
        System.out.println("Input: " + n2 + " | Output: " + sol.numSquares(n2));
    }
}
