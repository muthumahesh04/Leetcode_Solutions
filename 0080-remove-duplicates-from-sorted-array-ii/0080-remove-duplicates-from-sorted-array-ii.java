class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length<=2)
          return nums.length;
        
        int write_index=2;
        for(int read_index=2 ; read_index<nums.length ; read_index++)
        {
            if(nums[read_index]!=nums[write_index-2])
            {
                nums[write_index]=nums[read_index];;
                write_index++;
            }
        }
        return write_index;
    }
}