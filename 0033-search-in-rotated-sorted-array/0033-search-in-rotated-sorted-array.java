class Solution 
{
    public int search(int[] nums, int target) 
    {
        int low=0;
        int high=nums.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(nums[mid]==target)
               return mid;
            else if(nums[low]<=nums[mid]) //if the left half is sorted
            {
                if(target>=nums[low] && target<=nums[mid])//if the target is in the left half
                    high=mid;
                else
                    low=mid+1;
            }
            else                     //if the right half is sorted 
            {
                if(target>=nums[mid+1] && target<=nums[high])//if the target is in the right half
                {
                    low=mid+1;
                }
                else
                {
                    high=mid;
                }
            }
        }
        return -1;
    }
}