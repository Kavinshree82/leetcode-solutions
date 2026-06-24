//vertical sccan
//time complexity : 0(M x N)
//space : O(1)

class Solution {
    public String longestCommonPrefix(String[] strs)
     {
        for(int i=0;i<strs[0].length();i++)             //traverse first word in array
        {
            char c=strs[0].charAt(i);

            for(int j=1;j<strs.length;j++)             //traverse the array from second word
            {
                if(strs[j].length()==i || strs[j].charAt(i)!=c)
                {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
     }
}