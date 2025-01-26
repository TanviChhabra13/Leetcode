class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[] prefixTop = new long[n + 1];
        long[] prefixBottom = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefixTop[i + 1] = prefixTop[i] + grid[0][i];
            prefixBottom[i + 1] = prefixBottom[i] + grid[1][i];
        }

        long result = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long topRemaining = prefixTop[n] - prefixTop[i + 1];
            long bottomCollected = prefixBottom[i];
            result = Math.min(result, Math.max(topRemaining, bottomCollected));
        }

        return result;
    }
}
