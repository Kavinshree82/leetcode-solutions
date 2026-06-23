class Solution {
    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // Length = 2 initialization
        for (int v = 0; v < m; v++) {
            up[v] = v;              // smaller values
            down[v] = m - 1 - v;    // greater values
        }

        // Build lengths 3..n
        for (int len = 3; len <= n; len++) {

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            long[] prefDown = new long[m + 1];
            long[] prefUp = new long[m + 1];

            for (int i = 0; i < m; i++) {
                prefDown[i + 1] = (prefDown[i] + down[i]) % MOD;
                prefUp[i + 1] = (prefUp[i] + up[i]) % MOD;
            }

            long totalUp = prefUp[m];

            for (int v = 0; v < m; v++) {

                // u < v
                newUp[v] = prefDown[v];

                // u > v
                newDown[v] =
                        (totalUp - prefUp[v + 1] + MOD) % MOD;
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;

        if (n == 2) {
            return (int) ((long) m * (m - 1) % MOD);
        }

        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }
}