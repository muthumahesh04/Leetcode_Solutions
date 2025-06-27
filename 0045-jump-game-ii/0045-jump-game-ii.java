class Solution 
{
    public int jump(int[] nums) 
    {
        if(nums.length==1)
            return 0;
        int l=0;
        int r=0;
        int minimum_jumps=1;
        int maximum_coverage=0;

        while(r<nums.length)
        {
            for(int k=l ; k<=r ; k++)
            {
                maximum_coverage=Math.max(maximum_coverage,k+nums[k]);
            }
            if(maximum_coverage<=r) //we can't reach the end
               return -1;
            if(maximum_coverage>=nums.length-1)
               return minimum_jumps;
            
            l=r+1;
            r=maximum_coverage;
            minimum_jumps++;
        }
        return 0;
    }
}