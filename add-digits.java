class Solution {
    public int addDigits(int num) 
    {
        while(num > 9)
        {
            int sum=0;
            int t=num;

            while(t > 0)
            {
                sum = sum+(t%10);
                t=t/10;
            }
             num=sum;
        }
         return num;
        
    }
}