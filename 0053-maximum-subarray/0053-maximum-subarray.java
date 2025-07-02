class Solution    
{
    public int maxSubArray(int[] nums) 
    {
        int maximum_subarray_sum=nums[0];
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