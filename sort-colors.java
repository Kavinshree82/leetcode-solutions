class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        
        for(int x:nums)
        {
            if(x==0)  z++;
            else if(x==1) o++;
            else t++;
        }

        int idx=0;
        while(z-- >0) nums[idx++]=0;
        while(o-- >0) nums[idx++]=1;
        while(t-- >0) nums[idx++]=2;
        
    }
}