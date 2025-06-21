class Solution 
{
    public String convert(String s, int numRows) 
    {
        StringBuilder result=new StringBuilder();

        if(numRows==1)
            return s;
        for(int i=0 ; i<numRows ; i++)
        {
            for(int j=i ; j<s.length() ; j+=(numRows-1)*2)
            {
                result.append(s.charAt(j));

                //for the middle rows, append the middle characters
                if(i>0 && i<numRows-1 && j+((numRows-1)*2)-(i*2)<s.length())
                    result.append(s.charAt(j+((numRows-1)*2)-(i*2)));
            }
        }
        return result.toString();
    }
}