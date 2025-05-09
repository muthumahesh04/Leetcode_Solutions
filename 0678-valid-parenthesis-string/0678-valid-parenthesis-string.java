class Solution 
{
    public boolean checkValidString(String s) 
    {
        int open_stack[]=new int[s.length()];
        int open_top=-1;
        int star_stack[]=new int[s.length()];
        int star_top=-1;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open_stack[++open_top]=i;
            }
            else if(s.charAt(i)=='*')
            {
                star_stack[++star_top]=i;
            }
            else //if the closing bracket occurs
            {
                if(open_top>-1)//if the open_stack has the values
                    open_top--;
                else if(star_top>-1)
                    star_top--;
                else
                    return false;
            }
        }
        if(open_top==-1)//means all open brackets are balanced.star_stack is not considered.because even it has values.it considered as empty strings
           return true;
        //the below block will be executed when the open_stack has values
        while(open_top>-1 && star_top>-1)
        {
            if(open_stack[open_top]<star_stack[star_top])
            {
                open_top--;
                star_top--;
            }
            else
            {
                return false;
            }
        }       
        return open_top==-1;
    }
}