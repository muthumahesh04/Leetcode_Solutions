class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        // Arrays.sort(nums);
        // int length=nums.length;
        // return Math.max(nums[length-1]*nums[length-2]*nums[length-3] , nums[length-1]*nums[0]*nums[1]);

        Arrays.sort(nums);

        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;

        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]>max)
            {
                third_max=second_max;
                second_max=max;
                max=nums[i];
            }
            else if(nums[i]>second_max)
            {
                third_max=second_max;
                second_max=nums[i];
            }
            else if(nums[i]>third_max)
            {
                third_max=nums[i];
            }

            if(nums[i]<min)
            {
                second_min=min;
                min=nums[i];
            }
            else if(nums[i]<second_min)
            {
                second_min=nums[i];
            }
        }
        return Math.max(max*second_max*third_max, min*second_min*max);
    }
}