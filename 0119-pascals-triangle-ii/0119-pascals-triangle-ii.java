class Solution 
{
    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> list=new ArrayList<>();

        long first=1;
        int row=rowIndex+1;
        for(int column=1; column<=row ; column++)
        {
            list.add((int)(first));
            first=first*(row-column)/column;
        }
        return list;
    }
}