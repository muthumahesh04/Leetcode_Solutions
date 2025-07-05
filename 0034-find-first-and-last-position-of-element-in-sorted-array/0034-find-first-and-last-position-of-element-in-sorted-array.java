class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first_occurance=-1;
        int last_occurance=-1;
        
        int low=0;
        int high=nums.length-1;

        if(nums.length==0)
          return new int[]{first_occurance,last_occurance};

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(nums[mid]==target)
            {
                first_occurance=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        low=0;
        high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(nums[mid]==target)
            {
                last_occurance=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return new int[]{first_occurance,last_occurance};
    }
}