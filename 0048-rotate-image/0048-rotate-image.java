class Solution 
{
    public void transpose(int mat[][])
    {
        int rows=mat.length;
        int columns=mat[0].length;

        for(int row=0 ; row<rows ; row++)
        {
            for(int col=0 ; col<columns ; col++)
            {
                if(col>row)
                {
                    int temp=mat[row][col];
                    mat[row][col]=mat[col][row];
                    mat[col][row]=temp;
                }
            }
        }
    }
    public void reverse_rows(int[][] matrix)
    {
        for(int row=0 ; row<matrix.length ; row++)
        {
            reverse(matrix[row]);
        }
    }
    public void reverse(int array[])
    {
        int left=0;
        int right=array.length-1;

        while(left<right)
        {
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[][] matrix) 
    {
        transpose(matrix);
        reverse_rows(matrix);
    }
}