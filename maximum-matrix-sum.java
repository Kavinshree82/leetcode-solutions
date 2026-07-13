class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negative = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                 int val = matrix[i][j];
                 if (val < 0)
                    negative++;
                sum+=Math.abs(val);
                min=Math.min(min,Math.abs(val));
            }
        }
        if (negative % 2 == 0)
            return sum;
        
        return sum - 2L * min;
    }
}