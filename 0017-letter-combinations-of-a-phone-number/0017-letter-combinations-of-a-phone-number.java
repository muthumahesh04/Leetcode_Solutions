class Solution 
{
    public List<String> letterCombinations(String digits) 
    {
        List<String> result=new ArrayList<>();

        String[] keys={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(digits.length()==0)
           return result;

        Generate_Combinations(result,digits,"",keys);

        return result;
    }
    public void Generate_Combinations(List<String> result,String keys,String temp,String[] KeyPadString)
    {
        if(keys.length()==0)
        {
            result.add(temp);
            return;
        }
           

        String letters=KeyPadString[keys.charAt(0)-'0'];
        for(int i=0 ; i<letters.length() ; i++)
        {
            Generate_Combinations(result,keys.substring(1),temp+letters.charAt(i),KeyPadString);
        }
    }
}

