class Solution 
{
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        List<List<Integer>> result=new ArrayList<>();

        if(nums.length<4)
           return result;
        
        Arrays.sort(nums);

        for(int a=0 ; a<nums.length-3 ; a++)
        {
            if(a>0 && nums[a]==nums[a-1]) continue;

            for(int b=a+1 ; b<nums.length-2 ; b++)
            {
                if(b>a+1 && nums[b]==nums[b-1]) continue;

                int c=b+1;
                int d=nums.length-1;

                while(c<d)
                {
                    if((long)nums[a]+nums[b]+nums[c]+nums[d]==target)
                    {
                        result.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        c++;
                        d--;
                        while(c<d && nums[c]==nums[c-1]) c++;
                        while(c<d && nums[d]==nums[d+1]) d--;
                    }
                    else if(nums[a]+nums[b]+nums[c]+nums[d]<target)
                    {
                        c++;
                        while(c<d && nums[c]==nums[c-1]) c++;
                    }
                    else
                    {
                        d--;
                        while(c<d && nums[d]==nums[d+1]) d--;
                    }
                }
            }
        }
        return result;
    }
}