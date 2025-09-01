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
            first=first*(row-column)/column; //Here due to multiplication, the value will go away from the Intger.MAX after dividing it will come to inbetween the Int.MIN and Int.MAx 
        }
        return list;
    }
}