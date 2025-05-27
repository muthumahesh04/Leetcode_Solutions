class Solution 
{
    public int reverse(int x) 
    {
        int reversed_number=0;

        while(x!=0)
        {
            int remainder=x%10;

            if(reversed_number>Integer.MAX_VALUE/10 || (reversed_number==Integer.MAX_VALUE/10 && remainder>7))
               return 0;
            if(reversed_number<Integer.MIN_VALUE/10 || (reversed_number==Integer.MIN_VALUE/10 && remainder<-8))
               return 0;
            reversed_number=reversed_number*10+remainder;
            x=x/10;
        }
        return reversed_number;
    }
}