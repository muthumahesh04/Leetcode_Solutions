class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();

        GeneratePermutations(result,new ArrayList<>(),nums);

        return result;
    }
    public void GeneratePermutations(List<List<Integer>> result,List<Integer> tempList,int nums[])
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
            GeneratePermutations(result,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
}