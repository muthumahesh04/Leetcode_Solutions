class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        String str="";
        int smallest_string_length=smallest_str_length(strs);
        int index=0;
        while(index<smallest_string_length)
        {
            char ch=strs[0].charAt(index);
            for(int i=0;i<strs.length;i++)
            {
                if(ch!=strs[i].charAt(index))
                {
                    return str;
                }
            }
            str=str+ch;
            index++;
        }
        return str;
        
    }
    public int smallest_str_length(String[] array)
    {
        int length=array[0].length();
        for(int i=0;i<array.length;i++)
        {
            length=Math.min(length,array[i].length());
        }
        return length;
    }
}