class Solution 
{
    public String convert(String s, int numRows) 
    {
        StringBuilder result=new StringBuilder();

        if(numRows==1)
           return s;
        for(int i=0 ; i<numRows ; i++)
        {
            int temporary=i;
            int flag=0;

            while(temporary<s.length())
            {
                result.append(s.charAt(temporary));

                if(i==0 || i==numRows-1)     //for first and last rows
                {
                    temporary+=(numRows-1)*2;
                }
                else                        //for middle rows
                {
                    if(flag%2==0)
                    {
                        temporary+=((numRows-1)*2)-(2*i);
                        flag++;
                    }
                    else
                    {
                        temporary+=(i*2);
                        flag++;
                    }
                }
            }
        }
        return result.toString();
    }
}