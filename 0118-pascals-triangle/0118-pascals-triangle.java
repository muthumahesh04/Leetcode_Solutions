class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result=new ArrayList<>();

        for(int row=1 ; row<= numRows ; row++)
        {
            List<Integer> tempList=new ArrayList<>();

            int number=1;
            for(int col=1 ; col<=row ; col++)
            {
                tempList.add(number);
                number=number*(row-col)/col;
            }
            result.add(tempList);
        }
        return result;
    }
}