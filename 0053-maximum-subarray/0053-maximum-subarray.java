class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        if(nums.length==1)
           return nums[0];

        int maximum_subarray_sum=Integer.MIN_VALUE;
        int subarray_sum=0;

        for(int i=0 ; i<nums.length ; i++)
        {
            subarray_sum+=nums[i];

            if(subarray_sum>maximum_subarray_sum)
                maximum_subarray_sum=subarray_sum;

            if(subarray_sum<0)
                subarray_sum=0;
        }
        return maximum_subarray_sum;
    }
}