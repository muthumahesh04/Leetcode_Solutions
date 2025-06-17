class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {
        boolean is_increasing = false;
        boolean is_decreasing = false;

        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] > nums[i - 1]) 
            {
                is_increasing = true;
            } 
            else if (nums[i] < nums[i - 1]) 
            {
                is_decreasing = true;
            }
            //equal elements do not change the monotonicity. An array with all equal elements is also both non-increasing and non-decreasing.
            // If both increase and decrease happened, it's not monotonic
            if (is_increasing && is_decreasing) 
            {
                return false;
            }
        }

        return true;

    }
}