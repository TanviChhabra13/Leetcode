class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;    // Number of rows
        int n = mat[0].length; // Number of columns
        
        // Map to store value -> (row, col) mapping
        Map<Integer, int[]> valueToPosition = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                valueToPosition.put(mat[i][j], new int[]{i, j});
            }
        }
        
        // Arrays to track painted cell counts for rows and columns
        int[] rowPaintCount = new int[m];
        int[] colPaintCount = new int[n];
        
        // Process each value in arr
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int[] pos = valueToPosition.get(value);
            int row = pos[0];
            int col = pos[1];
            
            // Increment the count for the respective row and column
            rowPaintCount[row]++;
            colPaintCount[col]++;
            
            // Check if the row or column is fully painted
            if (rowPaintCount[row] == n || colPaintCount[col] == m) {
                return i; // Return the index where the first row/column is fully painted
            }
        }
        
        return -1; // Should not reach here under given constraints
    }
}