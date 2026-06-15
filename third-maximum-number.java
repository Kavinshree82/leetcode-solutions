class Solution {
    public int thirdMax(int[] nums) 
    {
       HashSet<Integer> set=new HashSet<>();

     //NO DUPLICATES
       for(int x:nums)
       {
        set.add(x);
       }

       List<Integer>list=new ArrayList<>(set);
       Collections.sort(list);

       int sz=list.size();

       if(sz<3)
       {
        return list.get(sz-1);
       }

       return list.get(sz-3);
    }

}