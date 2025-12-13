class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstocc=-1;
        int lastocc=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                firstocc=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            if(nums[j]==target)
            {
                lastocc=j;
                break;
            }
        }
        
        int[] res={firstocc,lastocc};
        return res;

        
    }
}