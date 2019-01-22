class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        int num = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    num++;
                    DFS(grid, i, j);
                }
            }
        }
        return num;
    }
    
    public void DFS(char[][]grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!='1') {
            return;    
        }
        grid[i][j] = '0';
        DFS(grid,i-1,j);
        DFS(grid,i+1,j);
        DFS(grid,i,j-1);
        DFS(grid,i,j+1);        
    }
}