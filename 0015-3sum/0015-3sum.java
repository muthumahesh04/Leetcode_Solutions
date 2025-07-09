class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();

        int length=nums.length;
        if(length<3)
           return result;

        Arrays.sort(nums);

        for(int i=0 ; i<length-2 ; i++)
        {
            if(i>0 && nums[i]==nums[i-1])
               continue;
            
            int left=i+1;
            int right=length-1;
            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }
                else if(nums[i]+nums[left]+nums[right] < 0)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}