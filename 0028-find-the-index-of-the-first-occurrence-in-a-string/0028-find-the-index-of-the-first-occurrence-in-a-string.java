class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        for(int i=0 ; i<=haystack.length()-needle.length() ; i++)
        {
            int j=0;
            int temp=i; //for traversing
            while(j<needle.length() && haystack.charAt(temp)==needle.charAt(j))
            {
                temp++;
                j++;
            }
            if(j==needle.length())
               return i;
        }
        return -1;
    }
}