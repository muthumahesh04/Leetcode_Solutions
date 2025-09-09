class Solution 
{
    public List<String> generateParenthesis(int n) 
    {
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        Generate_Parantheses(sb,result,0,0,n);

        return result;
    }
    public void Generate_Parantheses(StringBuilder str,List<String> result,int open,int close,int limit)
    {
        if(open==limit && close==limit)
        {
            result.add(str.toString());
            return;
        }
        if(open>limit || close>open)
            return;
        
        Generate_Parantheses(str.append("("),result,open+1,close,limit);
        str.deleteCharAt(str.length()-1);
        Generate_Parantheses(str.append(")"),result,open,close+1,limit);
        str.deleteCharAt(str.length()-1);
    }
}