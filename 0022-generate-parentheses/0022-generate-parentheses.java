class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();

        Generate_Parantheses("",result,0,0,n);

        return result;
    }
    public void Generate_Parantheses(String str,List<String> result,int open,int close,int limit)
    {
        if(open==limit && close==limit)
        {
            result.add(str);
            return;
        }
        if(open>limit || close>open)
            return;
        
        Generate_Parantheses(str+"(",result,open+1,close,limit);
        Generate_Parantheses(str+")",result,open,close+1,limit);
    }
}