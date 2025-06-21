class Solution 
{
    public String convert(String s, int numRows) 
    {
        StringBuilder result=new StringBuilder();

        if(numRows==1)
           return s;
        for(int i=0 ; i<numRows ; i++)
        {
            int step_value=i;
            int flag=0;

            while(step_value<s.length())
            {
                result.append(s.charAt(step_value));

                if(i==0 || i==numRows-1)     //for first and last rows
                {
                    step_value+=(numRows-1)*2;
                }
                else                        //for middle rows
                {
                    if(flag%2==0)
                    {
                        step_value+=((numRows-1)*2)-(2*i);
                        flag++;
                    }
                    else
                    {
                        step_value+=(i*2);
                        flag++;
                    }
                }
            }
        }
        return result.toString();
    }
}