class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal=new ArrayList();  //list of lists/rows
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row=new ArrayList();

            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)    // 0 is the first and i is the last
                {
                    row.add(1);
                }
                else
                {
                   List<Integer> prev = pascal.get(i-1);
                   row.add(prev.get(j)+prev.get(j-1));
                }
            }
            pascal.add(row);
        }

        return pascal;
}
}