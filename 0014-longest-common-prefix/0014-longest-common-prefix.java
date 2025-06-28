class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int smallest_string_length=find_smallest_string_len(strs);

        StringBuilder sb=new StringBuilder();
        
        int index=0;
        while(index<smallest_string_length)
        {
            char ch=strs[0].charAt(index);

            for(int i=0 ; i<strs.length ; i++)
            {
                if(ch!=strs[i].charAt(index))
                   return sb.toString();
            }
            sb.append(ch);
            index++;
        }
        return sb.toString();
    }
    public int find_smallest_string_len(String[] strings)
    {
        int smallest_length=strings[0].length();
        for(int i=0 ; i<strings.length ;i++)
        {
            if(strings[i].length()<smallest_length)
            {
                smallest_length=strings[i].length();
            }
        }
        return smallest_length;
    }
}