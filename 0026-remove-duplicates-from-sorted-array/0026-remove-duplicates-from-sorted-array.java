class Solution 
{
    public int removeDuplicates(int[] nums)
    {
        int write_index=1;

        for(int read_index=1; read_index<nums.length ; read_index++)
        {
            if(nums[read_index]!=nums[write_index-1])
            {
                nums[write_index]=nums[read_index];
                write_index++;
            }   
        }
        return write_index;
    }
}