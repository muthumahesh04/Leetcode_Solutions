class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int rows=matrix.length;
        int columns=matrix[0].length;

        int row=0;           //start of the row
        int column=columns-1;//start of the column

        while(column>=0 && row<rows)
        {
            if(matrix[row][column]==target)
               return true;
            
            else if(matrix[row][column]>target)
            {
                column--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
}