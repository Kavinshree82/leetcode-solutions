class Solution {
    public int mySqrt(int x) 
    {
      long left=0;
      long right=x;
      int ans=0;

      while(left<=right)
      {
        long mid=left+(right-left)/2;
        
        if(mid*mid <= x)
        {
            ans=(int)mid;
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }
      }
      return ans;
    }
}