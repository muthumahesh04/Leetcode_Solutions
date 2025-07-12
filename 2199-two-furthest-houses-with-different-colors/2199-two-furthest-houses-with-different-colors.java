class Solution 
{
    public int maxDistance(int[] colors) 
    {
        int max_distance=0;

        for(int i=0; i<colors.length ; i++)
        {
            if(colors[i]!=colors[0])
                max_distance=Math.max(max_distance,i);
            if(colors[i]!=colors[colors.length-1])
                max_distance=Math.max(max_distance,colors.length-1-i);
        }
        return max_distance;
    }
}