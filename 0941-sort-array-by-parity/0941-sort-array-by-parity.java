class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        if(nums.length==1)
           return nums;

        int even_no_pointer=0;
        int odd_no_pointer=0;

        while(odd_no_pointer<nums.length)
        {
            if(nums[even_no_pointer]%2==0)
            {
                even_no_pointer++;
                odd_no_pointer++;
            }
            else if(nums[odd_no_pointer]%2!=0)
            {
                odd_no_pointer++;
            }
            else
            {
                int temp=nums[even_no_pointer];
                nums[even_no_pointer]=nums[odd_no_pointer];
                nums[odd_no_pointer]=temp;
                even_no_pointer++;
                odd_no_pointer++;
            }
        }
        return nums;
    }
}