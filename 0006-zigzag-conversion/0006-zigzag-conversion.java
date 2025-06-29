class Solution 
{
    public String convert(String s, int numRows) 
    {
        if(numRows==1)
           return s;

        StringBuilder result=new StringBuilder();

        for(int row=0 ; row<numRows ; row++)
        {
            int temp=row;
            int flag=0;

            while(temp<s.length())
            {
                result.append(s.charAt(temp));

                if(row==0 || row==numRows-1)
                {
                    temp+=(numRows-1)*2;
                }
                else
                {
                    if(flag%2==0)
                    {
                        temp+=(numRows-1)*2-(row*2);
                        flag++;
                    }
                    else
                    {
                        temp+=row*2;
                        flag++;
                    }
                }
            }
        }
        return result.toString();
    }
}