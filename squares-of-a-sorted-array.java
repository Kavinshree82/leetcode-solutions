class Solution {
    public int[] sortedSquares(int[] nums)
     {
      
        for(int i=0;i<nums.length;i++)
        {
            int j=(nums[i]*nums[i]);
            nums[i]=j;
        }
        
        Arrays.sort(nums);
        return nums;
        
    }
}