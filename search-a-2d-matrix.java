// Complexity : O(log(m*n))
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
       int rows=matrix.length;
       int cols=matrix[0].length;

       int left=0;
       int right=rows*cols-1;

       while(left<=right)
       {
            int mid=left+(right-left)/2;

            // Convert 1D index to 2D position
            int r=mid/cols;
            int c=mid%cols;

            int value=matrix[r][c];

            if(value==target)
            {
                return true;
            }
            else if(value < target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
       }
       return false;
    }
}