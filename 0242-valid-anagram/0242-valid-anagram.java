class Solution 
{
    public boolean isAnagram(String s, String t) 
    {

        if(s.length()!=t.length())
             return false;
        
        int count_frequency[]=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            count_frequency[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++)
        {
            if(count_frequency[t.charAt(j)-'a']<=0)
               return false;
            count_frequency[t.charAt(j)-'a']--;
        }
        for(int i=0;i<count_frequency.length;i++)
        {
            if(count_frequency[i]!=0)
              return false;
        }
        return true;
    }
}
