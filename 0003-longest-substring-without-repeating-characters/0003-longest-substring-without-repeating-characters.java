class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int last_occured_index[]=new int[256];

        for(int i=0 ; i<256 ; i++)
        {
            last_occured_index[i]=-1;
        }

        int left=0;
        int right=0;
        int max_length=0;

        while(right<s.length())
        {
            if(last_occured_index[s.charAt(right)]<left)
            {
                max_length=Math.max(max_length,right-left+1);
            }
            else //If repeating characters occurs
            {
                left=last_occured_index[s.charAt(right)]+1;
            }
            last_occured_index[s.charAt(right)]=right;
            right++;
        }
        return max_length;
    }
}