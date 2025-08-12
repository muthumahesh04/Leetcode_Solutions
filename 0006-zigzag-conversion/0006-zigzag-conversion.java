class Solution 
{
    public String convert(String s, int numRows) 
    {
        StringBuilder sb=new StringBuilder();

        if(numRows==1)
          return s;
        
        for(int row=0 ; row<numRows ; row++)
        {
            for(int j=row ; j<s.length() ; j+=(numRows-1)*2)
            {
                sb.append(s.charAt(j));

                if(row>0 && row<numRows-1)
                {
                    if(j+(numRows-1)*2-(2*row)<s.length())
                       sb.append(s.charAt(j+(numRows-1)*2-(2*row)));
                }
            }
        }
        return sb.toString();
    }
}