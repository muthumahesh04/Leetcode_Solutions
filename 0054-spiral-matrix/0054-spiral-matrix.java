class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result=new ArrayList<>();
        int rows=matrix.length;
        int columns=matrix[0].length;
        
        int row_start=0;
        int row_end=rows-1;
        int col_start=0;
        int col_end=columns-1;
        
        while(row_start<=row_end && col_start<=col_end)
        {
            for(int i=col_start;i<=col_end;i++)//print left to right
            {
                result.add(matrix[row_start][i]);
                
            }
            row_start++;
            for(int i=row_start;i<=row_end;i++)//print from top to bottom
            {
                result.add(matrix[i][col_end]);
                
            }
            col_end--;
            if(row_start<=row_end)
            {
                for(int i=col_end;i>=col_start;i--)//print from right to left
                {
                    result.add(matrix[row_end][i]);
                
                }
            }
            row_end--;
            if(col_start<=col_end)
            {
                for(int i=row_end;i>=row_start;i--)//print from bottom to top
                {
                     result.add(matrix[i][col_start]);
                }
            }
            col_start++;
        }
        return result;
    }
}