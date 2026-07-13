class Solution {
    public int matrixSum(int[][] nums) {
        int r=nums.length;
        int c=nums[0].length;

        int score=0;

         // Sort every row
        for(int i = 0; i < r; i++) 
        {
            Arrays.sort(nums[i]);
        }

        for(int j=0;j<c;j++)
        {
            int max=0;
            for(int i = 0; i < r; i++) 
            {
                max = Math.max(max, nums[i][j]);
            }

            score += max;
        }

        return score;
    }
}