class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int j=0;
        for(int i=0 ; i<=haystack.length()-needle.length(); i++)
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                int temporary=i;
                while(j<needle.length() && temporary<temporary+needle.length())
                {
                    if( haystack.charAt(temporary)==needle.charAt(j))
                    {
                        temporary++;
                        j++;
                    }
                    else
                    {
                        break;
                    }
                }
                if(temporary==i+needle.length())
                  return i;
                else
                  j=0;
            }
        }
        return -1;
    }
}