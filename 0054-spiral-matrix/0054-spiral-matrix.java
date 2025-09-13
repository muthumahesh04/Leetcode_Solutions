class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result=new ArrayList<>();

        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        while(top<=bottom && left<=right)
        {
            //from left to right
            for(int i=left ; i<=right ; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;

            //from top to bottom
            for(int i=top ; i<=bottom ; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                //from right to left
                for(int i=right ; i>=left ; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right)
            {
                //from bottom to top
                for(int i=bottom ; i>=top ; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}