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
            for(int i=l;i<=r;i++)
            {
                maximum_coverage=Math.max(maximum_coverage,i+nums[i]);
            }
            if(maximum_coverage<=r)
               return -1;//we can't reach the end
            if(maximum_coverage>=nums.length-1)
              return minimum_jumps;
            
            minimum_jumps++;
            l=r+1;
            r=maximum_coverage;
        }
        return 0;
    }
}