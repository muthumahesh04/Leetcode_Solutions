class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int last_occurance[]=new int[256];
        for(int i=0 ; i<256 ; i++)
        {
            last_occurance[i]=-1;
        }

        int left=0;
        int right=0;
        int maxLength=0;

        while(right < s.length())
        {
            if(last_occurance[s.charAt(right)] < left)
            {
                maxLength=Math.max(maxLength,right-left+1);
            }
            else
            {
                left=last_occurance[s.charAt(right)]+1;
            }
            last_occurance[s.charAt(right)]=right;
            right++;
        }
        return maxLength;
    }
}