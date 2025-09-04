class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();

        backtrack(nums,result,new ArrayList<>());

        return result;
    }
    public void backtrack(int nums[],List<List<Integer>> result,List<Integer> tempList)
    {
        if(tempList.size()==nums.length)
        {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for(int num:nums)
        {
            if(tempList.contains(num))
               continue;
            
            tempList.add(num);

            backtrack(nums,result,tempList);

            tempList.remove(tempList.size()-1);
        }
    }
}