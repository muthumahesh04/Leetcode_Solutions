class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        int n=board.length;
        int[][] row=new int[n][n];
        int[][] col=new int[n][n];
        int[][] box=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                char current=board[i][j];
                if(current!='.')
                {
                    int num=current-'1';
                    int boxIndex=((i/3)*3)+(j/3);

                if(row[i][num]==1 || col[j][num]==1 ||box[boxIndex][num]==1)
                  return false;

                row[i][num]=1;
                col[j][num]=1;
                box[boxIndex][num]=1;
                }
                
            }
        }
        return true;
    }
}