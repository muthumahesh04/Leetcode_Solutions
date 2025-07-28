class Solution 
{
    public int maximum_bananas(int piles[])
    {
        int max_banana=0;
        for(int i=0 ; i<piles.length ; i++)
        {
            max_banana=Math.max(max_banana,piles[i]);
        }
        return max_banana;
    }
    public int minEatingSpeed(int[] piles, int h) 
    {
        int low=1;
        int high=maximum_bananas(piles); //here this values represents bananas per hour
       
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(isvalid(piles,mid,h))
               high=mid-1;
            else
               low=mid+1;
        }
        return low;
    }
    public boolean isvalid(int piles[],int t_bananas_per_hour,int deadline)
    {
        int hours_required=0;
        
        for(int i=0 ; i<piles.length ; i++)
        {
            hours_required+=Math.ceil((double)piles[i]/t_bananas_per_hour);
        }
        return hours_required<=deadline;
    }
}