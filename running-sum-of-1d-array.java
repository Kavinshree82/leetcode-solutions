class Solution {
    public int[] runningSum(int[] nums)
     {
       
        for(int i=1;i<nums.length;i++)
        {
             nums[0]=nums[0];
             nums[i]+=nums[i-1];
        }
        
        return nums;
     }
}