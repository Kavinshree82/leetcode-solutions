/*
Efficient Approach
 >> Compute sumA and sumB.
 >> Store Bob's candies in a HashSet for O(1) lookup.
 >> For every Alice candy x:
        >> Calculate required y.
        >> If y exists in Bob's set, return {x, y}. */

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int sumA=0;
        int sumB=0;

        for(int a:aliceSizes)
        {
            sumA+=a;
        }
        for(int b:bobSizes)
        {
            sumB+=b;
        }

        int diff=(sumA-sumB)/2;

        HashSet<Integer>set=new HashSet<>();

        for(int b:bobSizes)
        {
            set.add(b);
        }

        for(int x:aliceSizes)
        {
            int y=x-diff;
            if(set.contains(y))
            {
                return new int[]{x,y};
            }
        }
        return new int[0];
    }
}