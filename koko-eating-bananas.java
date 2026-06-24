class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;

        for(int p:piles)
        {
            right=Math.max(right,p);
        }

        int ans=right;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            long hours=0;

             // Calculate hours needed at speed = mid
            for (int pile : piles) {
                hours += Math.ceil((double) pile / mid); // ceil(pile / mid)
            }

            if (hours <= h) {
                ans = mid;       // valid speed
                right = mid - 1; // try smaller speed
            } else {
                left = mid + 1;  // need faster speed
            }
        }

        return ans;
    }
}