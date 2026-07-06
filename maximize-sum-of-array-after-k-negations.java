//always flip negative numbers first, starting from the most negative value.
//if all negatives are already flipped,Flip the smallest absolute value, because it decreases the sum the least

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k)
     {
       Arrays.sort(nums);

       // Flip negative numbers first
       for(int i=0;i<nums.length && k>0;i++)
       {
            if(nums[i]<0)
            {
                nums[i]=-nums[i];
                k--;
            }
       }

       int sum = 0;
       int minAbs = Integer.MAX_VALUE;

       for(int x:nums)
       {
            sum+=x;
            minAbs=Math.min(minAbs,Math.abs(x));
       }

       if(k%2==1)
       {
        sum-=2*minAbs;
       }

        return sum;
     }
}