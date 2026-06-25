//-> Top Right Traversal (since every column is sorted decreasingly)

class Solution {
    public int countNegatives(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        int i=0;
        int j=cols-1;       //back right

        int count=0;

        while(i<rows && j>=0)
        {
            if(grid[i][j]<0)
            {   
                count += (rows-i);
                j--;
            }
            else
            {
                i++;
            }
        }
        return count;
    }
}

// Time Complexity: O(m+n)
// Space Complexity: O(1)