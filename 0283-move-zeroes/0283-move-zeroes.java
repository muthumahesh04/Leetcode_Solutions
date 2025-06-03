class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int zeropointer=0;
        int nonzeropointer=0;

        while(nonzeropointer<nums.length)
        {
            if(nums[zeropointer]!=0)
            {
                zeropointer++;
                nonzeropointer++;
            }
            else if( nums[nonzeropointer]==0)
            {
                nonzeropointer++;
            }
            else
            {
                int temp=nums[zeropointer];
                nums[zeropointer]=nums[nonzeropointer];
                nums[nonzeropointer]=temp;
            }
        }
    }
}