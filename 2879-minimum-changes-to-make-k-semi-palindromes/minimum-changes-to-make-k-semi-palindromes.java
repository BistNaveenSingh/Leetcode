class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        char[] ch = s.toCharArray();

        List<Integer>[] divisors = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            divisors[i] = new ArrayList<>();
        }
        for (int d = 1; d < n; d++) {
            for (int m = 2 * d; m <= n; m += d) {
                divisors[m].add(d);
            }
        }

        int[][] cost = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;
                int best = Integer.MAX_VALUE;
                for (int d : divisors[len]) {
                    int changes = 0;
                    int groupSize = len / d;
                    for (int r = 0; r < d; r++) {
                        int lo = i + r;
                        int hi = i + r + (groupSize - 1) * d;
                        while (lo < hi) {
                            if (ch[lo] != ch[hi]) changes++;
                            lo += d;
                            hi -= d;
                        }
                    }
                    best = Math.min(best, changes);
                }
                cost[i][j] = best;
            }
        }

        int INF = Integer.MAX_VALUE / 2;
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) Arrays.fill(row, INF);
        dp[0][0] = 0;

        for (int j = 1; j <= k; j++) {
            for (int p = 2 * j; p <= n; p++) {
                for (int q = 2 * (j - 1); q <= p - 2; q++) {
                    if (dp[q][j - 1] < INF) {
                        dp[p][j] = Math.min(dp[p][j], dp[q][j - 1] + cost[q][p - 1]);
                    }
                }
            }
        }
        return dp[n][k];
    }
}