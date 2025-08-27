class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();
        Subsets(nums,0,result,new ArrayList<>());

        return result; 
    }
    public void Subsets(int arr[],int index,List<List<Integer>> result,List<Integer> tempList)
    {
        if(index==arr.length)
        {
            result.add(new ArrayList<>(tempList));
            return;
        }
        tempList.add(arr[index]);
        Subsets(arr,index+1,result,tempList);
        tempList.remove(tempList.size()-1);
        Subsets(arr,index+1,result,tempList);
    }
}