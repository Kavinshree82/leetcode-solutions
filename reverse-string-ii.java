class Solution {
    public String reverseStr(String s, int k) {
        char[]ss=s.toCharArray();

        for(int start=0; start<ss.length; start+=2*k)
        {
         int i=start;
         int j=Math.min(start+k-1,ss.length-1);
         {
            while(i<j)
            {
                char t=ss[i];
                ss[i]=ss[j];
                ss[j]=t;
                i++;
                j--; 
            } 
         }
        }
        String res=new String(ss);

        return res;
    }

}