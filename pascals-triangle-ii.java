class Solution {
    public List<Integer> getRow(int rowIndex)
     {
        List<Integer> r=new ArrayList<>();
        long num=1;
        for(int i=0;i<=rowIndex;i++)
        {  
            r.add((int)num);
            num =  num*(rowIndex-i)/(i+1);
        }
        return r;
    }
}