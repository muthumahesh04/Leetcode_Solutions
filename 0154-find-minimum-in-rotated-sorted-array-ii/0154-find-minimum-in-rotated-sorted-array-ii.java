class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int minimum=nums[0];
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
           
            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                minimum = Math.min(minimum, nums[mid]);
                low++;
                high--;
                continue;
            }
            
            if(nums[low]<=nums[mid]) //if the left half is sorted
            {
                minimum=Math.min(minimum,nums[low]);

                low=mid+1;
            }
            else//if the right half is sorted
            {
                minimum=Math.min(minimum,nums[mid]);

                high=mid-1;
            }
        }
        return minimum;
    }
}