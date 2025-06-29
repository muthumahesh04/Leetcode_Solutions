class Solution 
{
    public String convert(String s, int numRows) 
    {
        if(numRows==1)
           return s;
        StringBuilder result=new StringBuilder();

        for(int row=0 ; row<numRows ; row++)
        {
            for(int index=row ; index<s.length() ; index+=(numRows-1)*2)
            {
                result.append(s.charAt(index));

                if(index+(numRows-1)*2-(row*2)<s.length() && row>0 && row<numRows-1) //for middle rows
                {
                    result.append(s.charAt(index+(numRows-1)*2-(row*2)));
                }
            }
        }
        return result.toString();
    }
}