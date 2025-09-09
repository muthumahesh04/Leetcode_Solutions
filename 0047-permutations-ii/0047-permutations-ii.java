class Solution 
{
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();
        boolean[] isTaken=new boolean[nums.length];
       
        GeneratePermutations(result,new ArrayList<>(),nums,isTaken);

        return result;
    }
    public void GeneratePermutations(List<List<Integer>> result,List<Integer> tempList,int nums[],boolean[] isTaken)
    {
        if(tempList.size()==nums.length && !result.contains(tempList))
        {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for(int i=0 ; i<nums.length ; i++)
        {
            // if(tempList.contains(num))
            //    continue;
            if(isTaken[i])
              continue;
            isTaken[i]=true;
            tempList.add(nums[i]);

            GeneratePermutations(result,tempList,nums,isTaken);

            isTaken[i]=false;
            tempList.remove(tempList.size()-1);
        }
    }
}

