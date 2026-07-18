class Solution {
    public int closedIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==0)     // Found land
                {
                    if(dfs(grid,i,j))
                    {
                         count++;
                    }
                }
            }
        }
        return count;
        
    }
    private boolean dfs(int[][] grid,int r,int c)
    {
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length)
            return false;

        if(grid[r][c]==1)
            return true;

        grid[r][c]=1;

        boolean up=dfs(grid,r+1,c);
        boolean down=dfs(grid,r-1,c);
        boolean right=dfs(grid,r,c+1);
        boolean left=dfs(grid,r,c-1);

        return up && down && left && right;
    }
}