class Solution 
{
    public int Maximum(int array[])
    {
        int max=array[0];
        int length=array.length;

        for(int i=0 ; i<length ; i++)
        {
            if(array[i]>max)
              max=array[i];
        }
        return max;
    }
    public int Sum(int array[])
    {
        int sum=0;
        int length=array.length;

        for(int i=0 ; i<length ; i++)
        {
            sum=sum+array[i];
        }
        return sum;
    }
    public int splitArray(int[] nums, int k) 
    {
        int low=Maximum(nums);
        int high=Sum(nums);

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(isPossible_to_split_k_subarrays(nums,k,mid))
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    public boolean isPossible_to_split_k_subarrays(int nums[],int k,int assumed_largest_sum)
    {
        int count_subarrays=1;
        int current_subarray_sum=0;

        for(int i=0 ; i<nums.length ; i++)
        {
            if(current_subarray_sum+nums[i]<=assumed_largest_sum)
            {
                current_subarray_sum+=nums[i];
            }
            else
            {
                count_subarrays++;
                current_subarray_sum=nums[i];
            }
        }
        return count_subarrays<=k;
    }
}