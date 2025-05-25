class Solution 
{
    public int candy(int[] ratings) 
    {
        int sum=1;
        int i=1;

        while(i<ratings.length)
        {
            if(ratings[i]==ratings[i-1])
            {
                sum+=1;
                i++;
                continue;
            }
            int peak=1;
            while(i<ratings.length && ratings[i]>ratings[i-1])
            {
                peak+=1;
                sum+=peak;
                i++;
            }
            int down=1;
            while(i<ratings.length && ratings[i]<ratings[i-1])
            {
                sum+=down;
                down+=1;
                i++;
            }
            if(down>peak)
            {
                sum=sum-peak+down;
            }
        }
        return sum;
    }
}