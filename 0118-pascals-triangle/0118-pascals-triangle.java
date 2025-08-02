class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result=new ArrayList<>();

        for(int row=1 ; row<=numRows ; row++)
        {
            List<Integer> list=new ArrayList<>();

            int first=1;
            for(int column=1 ; column<=row ; column++)
            {
                list.add(first);
                first=first*(row-column)/column;
            }
            result.add(list);
        }
        return result;
    }
}