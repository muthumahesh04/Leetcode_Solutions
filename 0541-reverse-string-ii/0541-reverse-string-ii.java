class Solution 
{
    public void reverse(StringBuilder sb,int start,int end)
    {
        while(start<end)
        {
            char temp=sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));  // ✅ use setCharAt
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) 
    {
           
        StringBuilder sb=new StringBuilder(s);

        if(s.length()<k)
           return sb.reverse().toString();
        if(s.length()<2*k && s.length()>=k)
        {
            reverse(sb,0,0+k-1);
            return sb.toString();
        }
        for(int i=0 ; i<sb.length() ;i+=(k*2))
        {
            reverse(sb, i, Math.min(i + k - 1, sb.length() - 1));
        }
        return sb.toString();
    }
}