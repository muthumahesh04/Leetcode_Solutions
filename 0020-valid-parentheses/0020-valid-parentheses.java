class Solution 
{
    public boolean isValid(String s) 
    {
        int length=s.length();

        char stack[]=new char[length];
        int top=-1;

        for(int i=0 ; i<s.length() ; i++)
        {
            //if it is the open bracket
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack[++top]=s.charAt(i);
            //if it is the close bracket
            else
            {
                if(top!=-1 && ((s.charAt(i)==')' && stack[top]=='(') || (s.charAt(i)=='}' && stack[top]=='{') || (s.charAt(i)==']' && stack[top]=='[')))
                   top--;
                else
                   return false;
            }
        }
        return top==-1;
    }
}
