class Solution 
{
    public boolean checkValidString(String s) 
    {
        int minimum_possible_unmatched_open_brackets=0;
        int maximum_possible_unmatched_open_brackets=0;

        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)=='(')
            {
                minimum_possible_unmatched_open_brackets++;
                maximum_possible_unmatched_open_brackets++;
            }
            else if(s.charAt(i)=='*')
            {
                if(minimum_possible_unmatched_open_brackets>0)
                   minimum_possible_unmatched_open_brackets--;
                maximum_possible_unmatched_open_brackets++;
            }
            else//if it is the closing bracket
            {
                if(minimum_possible_unmatched_open_brackets>0)
                   minimum_possible_unmatched_open_brackets--;
                maximum_possible_unmatched_open_brackets--;
            }

            if(maximum_possible_unmatched_open_brackets<0)
               return false;
        }
        return minimum_possible_unmatched_open_brackets==0;
    }
}