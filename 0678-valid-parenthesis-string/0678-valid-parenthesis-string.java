class Solution {
    public boolean checkValidString(String s) {
        int min_open=0;
        int max_open=0;

        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)=='(')
            {
                min_open++;
                max_open++;
            }
            else if(s.charAt(i)==')')
            {
                if(min_open>0)
                   min_open--;
                max_open--;
            }
            else
            {
                if(min_open>0)
                   min_open--; //treated * as ) or ""
                max_open++;    //treated * as (
            }
            if(max_open<0) 
               return false;
            
        }
        return min_open==0;
    }
}