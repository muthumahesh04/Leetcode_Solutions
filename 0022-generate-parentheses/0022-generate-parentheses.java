class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();

        Generate_Parantheses(result,"",0,0,n);

        return result;
    }
    public void Generate_Parantheses(List<String> result,String str,int open,int close,int limit)
    {
        if(open>limit || close>open)
           return;
        if(open==limit && close==limit)
        {
            result.add(str);
            return;
        }
        Generate_Parantheses(result,str+"(",open+1,close,limit);
        Generate_Parantheses(result,str+")",open,close+1,limit);
    }
}