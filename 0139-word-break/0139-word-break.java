class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        //convert the list to Set for fast O(1) lookups
        Set<String> dictionary=new HashSet<>(wordDict);

        int maxLength=0;
        for(String str:wordDict)
        {
            maxLength=Math.max(maxLength,str.length());
        }

        int s_length=s.length();

        boolean[] dp_array=new boolean[s_length+1];

        dp_array[0]=true;

        for(int i=1 ; i<=s_length ; i++)
        {
            for(int j=i-1 ; j>=Math.max(0,i-maxLength) ; j--)
            {
                if(dp_array[j] && dictionary.contains(s.substring(j,i)))
                {
                    dp_array[i]=true;
                    break;
                }
            }
        }
        return dp_array[s_length];
    }
}