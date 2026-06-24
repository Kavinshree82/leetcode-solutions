class Solution {
    public String countAndSay(int n) {

        String res="1";

        for(int i=2;i<=n;i++)
        {
            StringBuilder next=new StringBuilder();
            int count=1;
            for(int j=1;j<=res.length();j++)
            {
                if(j<res.length() && res.charAt(j)==res.charAt(j-1))
                {
                    count++;
                }
                else
                {
                    next.append(count);
                    next.append(res.charAt(j-1));
                    count=1;
                }
            }
            res=next.toString();
        }
        return res;
    }
}