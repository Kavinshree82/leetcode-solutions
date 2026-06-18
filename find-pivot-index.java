class Solution {
    public int pivotIndex(int[] nums) 
    {
      int totSum=0;
      for(int x:nums)
      {
        totSum+=x;
      }

      int leftSum=0;
      for(int i=0;i<nums.length;i++)
      {
        int rightSum=totSum-leftSum-nums[i];

        if(leftSum==rightSum)
        {
            return i;
        }
        leftSum+=nums[i];
      }
      return -1;
    }
}