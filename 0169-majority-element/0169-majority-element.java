class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int count=0;
        int assumed_majority=nums[0];

        for(int i=0;i<nums.length;i++)
        {
            if(assumed_majority==nums[i])
                count++;
            else 
                count--;

            if(count==0)
            {
                assumed_majority=nums[i];
                count=1;
            }
        }
        return assumed_majority;
    }
}