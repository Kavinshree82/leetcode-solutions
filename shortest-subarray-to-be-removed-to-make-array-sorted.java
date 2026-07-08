//Tried
class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;

        //sorted prefix
        int left=0;
        while(left<n-1 && arr[left]<=arr[left+1])
        {
            left++;
        }
        if(left == n-1)     //full array is sorted
            return 0;

        //sorted suffix
        int right=n-1;
        while(right>0 && arr[right-1]<=arr[right])
        {
            right--;
        }

        //op 1  :  Remove every element after prefix ; op 2 : Remove every element before suffix 
        int ans=Math.min( n-left-1, right );

        //left  : End of sorted prefix  
        //Right : Start of sorted Suffix

        // or two pointers
        int i=0;
        int j=right;
        while(i<=left && j<n)
        {
            if(arr[i]<=arr[j])
            {
                ans=Math.min(j-i-1,ans);
                i++;
            }
            else
            {
                j++;
            }
        }
        return ans;
    }
}