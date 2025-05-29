class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        if(nums.length==1) //if there is only one element that is the peak
            return 0;
        if(nums[0]>nums[1]) //if the first element is the peak element
            return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) //if the last element is the peak element
            return nums.length-1;

        int low=1;              //important. consider index 1 as low. beacuse index 0 has no mid-1
        int high=nums.length-2;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
               return mid;
            else if(nums[mid]>nums[mid-1])
               low=mid+1;
            else
               high=mid-1;
        }
        return 0;
           
    }
}