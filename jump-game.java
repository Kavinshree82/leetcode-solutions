class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxReach)     //initially maxr is 0 what if index is 1 or more than that, we cannot reach right...
            {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if(maxReach>=nums.length-1)   //maxreach is more than/EQUAL to size
            {
                return true;
            }
        }
        return true;
    }
}