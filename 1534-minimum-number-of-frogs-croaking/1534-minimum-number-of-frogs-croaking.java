class Solution 
{
    public int minNumberOfFrogs(String croakOfFrogs) 
    {
        int[] croak=new int[5];
        int frogs_count=0;
        int maximum_frogs_active_at_same_time=0;

        for(int i=0 ;  i<croakOfFrogs.length() ; i++)
        {
            if(croakOfFrogs.charAt(i)=='c')
            {
                croak[0]++;
                frogs_count++;
                maximum_frogs_active_at_same_time=Math.max(maximum_frogs_active_at_same_time,frogs_count);
            }
            else if(croakOfFrogs.charAt(i)=='r')
            {
                if(croak[0]==0)
                  return -1;
                croak[0]--;
                croak[1]++;
            }
            else if(croakOfFrogs.charAt(i)=='o')
            {
                if(croak[1]==0)
                  return -1;
                croak[1]--;
                croak[2]++;
            }
            else if(croakOfFrogs.charAt(i)=='a')
            {
                if(croak[2]==0)
                  return -1;
                croak[2]--;
                croak[3]++;
            }
            else if(croakOfFrogs.charAt(i)=='k')
            {
                if(croak[3]==0)
                  return -1;
                croak[3]--;
                croak[4]++;
                frogs_count--;
            }
            else
            {
                return -1;
            }
        }
        if(croak[0]!=0 ||croak[1]!=0 || croak[2]!=0 ||croak[3]!=0)
          return -1;
        return maximum_frogs_active_at_same_time;
    }
}