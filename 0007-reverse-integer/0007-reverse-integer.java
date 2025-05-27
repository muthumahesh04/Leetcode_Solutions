class Solution 
{
    public int reverse(int x) 
    {

    
    long ans=0;
    
    while(x!=0)
    {
     int r=x%10;
      ans=ans*10+r;
      x=x/10;
    }
    return (ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)?0 : (int)ans;
    }
}