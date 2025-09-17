class Solution 
{
    public String longestPalindrome(String s) 
    {
        if(s.length() <= 1)
           return s;

        String LPS="";
        
        for(int i=0 ; i < s.length()-1 ; i++)
        {
            //Consider odd length
            int low=i;
            int high=i;

            while(s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;

                if(low==-1 || high==s.length())
                    break;
            }
            String palindrome=s.substring(low+1,high);
            if(palindrome.length() > LPS.length())
            {
                LPS=palindrome;
            }

            //consider even length
            low=i;
            high=i+1;

            while(s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;

                if(low==-1 || high==s.length())
                    break;
            }
            palindrome=s.substring(low+1,high);
            if(palindrome.length() > LPS.length())
            {
                LPS=palindrome;
            }
        }
        return LPS;
    }
}