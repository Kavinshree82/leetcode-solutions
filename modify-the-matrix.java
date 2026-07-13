class Solution {
    public int[][] modifiedMatrix(int[][] matrix) 
    {
        int r=matrix.length;
        int c=matrix[0].length;

        int[][] answer=new int[r][c];
        int[] maxCol = new int[c];

        for(int j=0;j<c;j++)
        {
            int max=0;
            for(int i=0;i<r;i++)
            {
                max=Math.max(max,matrix[i][j]);
            }
            maxCol[j]=max;
        }


        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==-1)
                {
                    answer[i][j] = maxCol[j];
                }
                else
                {
                    answer[i][j] = matrix[i][j];
                }
            }
        }
        return answer;
    }
}