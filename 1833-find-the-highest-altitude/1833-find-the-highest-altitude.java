class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int max_gain=0;
        int gain_at_each_point=0;

        for(int i=0 ; i<gain.length ; i++)
        {
            gain_at_each_point+=gain[i];

            if(gain_at_each_point>max_gain)
            {
                max_gain=gain_at_each_point;
            }
        }
        return max_gain;
    }
}