class Solution 
{
    public int candy(int[] ratings) 
    {
        int minimum_chocolates=1; //the first children is always assigned with a chocolate

        int index=1;

        while(index < ratings.length)
        {
            int upwards=1;
            while(index<ratings.length && ratings[index]>ratings[index-1])
            {
                minimum_chocolates+=(++upwards);
                index++;
            }
            int downwards=1;
            while(index<ratings.length && ratings[index]<ratings[index-1])
            {
                minimum_chocolates+=downwards++;
                index++;
            }
            while(index<ratings.length && ratings[index]==ratings[index-1])
            {
                minimum_chocolates+=1;
                index++;
            }
            if(downwards>upwards)
               minimum_chocolates=minimum_chocolates+(downwards-upwards);
        }
        return minimum_chocolates;
    }
}