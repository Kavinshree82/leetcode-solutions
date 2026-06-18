class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;

        while(left<right)
        {
            int mid=left+(right-left)/2;
           
            if(nums[mid]>nums[right])       //if middle element is greater than right (ans is in right side)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }

        }
        return nums[left];
    }
}