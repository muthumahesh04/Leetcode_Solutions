class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();

        Arrays.sort(nums);

        Subsets(nums,0,result,new ArrayList<>());

        return result; 
    }
    public void Subsets(int arr[],int index,List<List<Integer>> result,List<Integer> tempList)
    {
        if(result.contains(tempList))
           return;
        if(index==arr.length && !result.contains(tempList))
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