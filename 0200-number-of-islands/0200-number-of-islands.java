class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int rows= grid.length;
        int columns= grid[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid, i, j, rows, columns);
                    }
                }
            }
        return count;
    }

    public void dfs(char[][]grid, int i, int j, int rows, int columns){
        if(i<0 || j<0 || i>= rows || j>= columns || grid[i][j]=='0') return;
        
        grid[i][j]='0';

        dfs(grid, i+1, j, rows, columns);
        dfs(grid, i, j+1, rows, columns);
        dfs(grid, i-1, j, rows, columns);
        dfs(grid, i, j-1, rows, columns);
    }
}