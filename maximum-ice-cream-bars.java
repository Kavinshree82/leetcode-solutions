class Solution {
    public int maxIceCream(int[] costs, int coins) 
    {
        Arrays.sort(costs);

        int op=0;

        for(int x:costs)
        {
            if(x>coins)
            {
                break;
            }
            coins-=x;
            op++;
        }
        return op;
    }
}