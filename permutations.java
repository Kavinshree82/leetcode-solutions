class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),result);
        return result;
    }

    static void backtrack(int[] nums,List<Integer>current, List<List<Integer>>result)
    {

        if(nums.length==current.size())
        {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int x: nums)
        {
            if(current.contains(x))
                continue;
            current.add(x);

            backtrack(nums,current,result);

            current.remove(current.size()-1);
        }
    }

}