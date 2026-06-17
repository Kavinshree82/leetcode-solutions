class Solution {
    public int[] plusOne(int[] digits)
     {
       for(int i=digits.length-1;i>=0;i--)
       {
        if(digits[i]<9)    //if last dig less than 9 -> inc 1
        {
            digits[i]+=1;
            return digits;
        }
        else                // if last dig is 9 make it as 0 carry 1 to left
        {
             digits[i]=0;
        }
       }
       int[]result=new int[digits.length+1];    //all elements are 9,carry 1
       result[0]=1;

       return result;
    }
}