class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1)
             return true;

        boolean is_increasing=false;
        boolean is_decreasing=false;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                is_increasing=true;
            }
            else if(nums[i]<nums[i-1])
            {
                is_decreasing=true;
            }
        }
        if(is_increasing==true && is_decreasing==true)
           return false;
        return true;
    }
}