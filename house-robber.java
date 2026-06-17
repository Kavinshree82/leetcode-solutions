//space-optimized dynamic programming solution

class Solution {
    public int rob(int[] nums) {
        
       int prevhouse=0;
       int prevprevhouse=0;

       for(int x:nums){
          int temp=Math.max(prevhouse,prevprevhouse+x);
          prevprevhouse=prevhouse;
          prevhouse=temp;
        }
       
        return prevhouse;   //prevhouse stores the maximum amount robbed 
    }
    
}

//time complexity  : O(n)
//space complexity : O(1)