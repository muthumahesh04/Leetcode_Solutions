class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        if(nums.length<3)
          return -1;
        Arrays.sort(nums);

        int closest_sum=nums[0]+nums[1]+nums[2];

        for(int i=0 ; i<nums.length-2 ; i++)
        {
            int left=i+1;
            int right=nums.length-1;

            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                
                if(Math.abs(target-sum) < Math.abs(target-closest_sum))
                    closest_sum=sum;
                
                if(sum==target)
                    return sum;
                else if(sum<target)
                   left++;
                else
                   right--;
            }
        }
        return closest_sum;
    }
}