class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();

        generateSubsets(result,new ArrayList<>(),nums,0);

        return result;
    }
    public void generateSubsets(List<List<Integer>> result,List<Integer> tempList,int nums[],int index)
    {
        if(index==nums.length)
        {
            result.add(new ArrayList<>(tempList));
            return;
        }

        tempList.add(nums[index]);
        generateSubsets(result,tempList,nums,index+1);

        tempList.remove(tempList.size()-1);
        generateSubsets(result,tempList,nums,index+1);
    }
}